/**
 * Copyright 2019-2020 覃海林(qinhaisenlin@163.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 
package com.qinhailin.common.config;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.wall.WallFilter;
import com.jfinal.aop.Inject;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.template.Engine;
import com.jfinal.template.source.ClassPathSourceFactory;
import com.qinhailin.common.directive.MyNowDirective;
import com.qinhailin.common.handler.CommonHandler;
import com.qinhailin.common.intercepor.ExceptionInterceptor;
import com.qinhailin.common.intercepor.LoggerInterceptor;
import com.qinhailin.common.intercepor.SessionInterceptor;
import com.qinhailin.common.intercepor.TokenInterceptor;
import com.qinhailin.common.kit.DruidKit;
import com.qinhailin.common.model._MappingKit;
import com.qinhailin.common.routes.AutoBindRoutes;
import com.qinhailin.common.safe.XssHandler;
import com.qinhailin.common.util.Cron4jPlugin;
import com.qinhailin.portal.meiko.oa.ctr.RealController;
import com.qinhailin.portal.meiko.oa.ctr.TimerController;
import com.qinhailin.portal.meiko.oa.service.RestWebService;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.plugin.ehcache.EhCachePlugin;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.json.FastJsonFactory;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.CaseInsensitiveContainerFactory;
import com.jfinal.plugin.activerecord.SqlReporter;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.activerecord.dialect.OracleDialect;

public class MainConfig extends JFinalConfig {
	/**
	 *运行main方法启动项目
	 */
	public static void main(String[] args) {
		System.out.println("=============认证开始=========");
		if(RestWebService.getInstence().authenticate()) {
			System.out.println("=============认证成功=========");
		};		
		UndertowServer.start(MainConfig.class);
	}
	// 系统启动完成后回调
	public void onStart() {			
		new RealController().startRun();
		new TimerController().startRun();
	}
	 
	// 系统关闭之前回调
	public void onStop() {
	}
	// 使用 jfinal-undertow 时此处仅保留声明，不能有加载代码
	private static Prop p;
	// 先加载开发环境配置，再追加生产环境的少量配置覆盖掉开发环境配置
	static void loadConfig() {
		
		if (p == null) {
			p = PropKit.use("config-dev.txt").appendIfExists("config-pro.txt");
		}
	}
		
	/**
	 * 配置JFinal常量
	 */
	@Override
	public void configConstant(Constants me) {
		// 读取数据库配置文件
		loadConfig();		
		// 设置当前是否为开发模式
		me.setDevMode(p.getBoolean("devMode"));
		// 设置默认上传文件保存路径 getFile等使用
		me.setBaseUploadPath(p.get("baseUploadPath"));
		// 设置默认下载文件路径 renderFile使用
		me.setBaseDownloadPath(p.get("baseDownloadPath"));
		// 设置error渲染视图
		me.setError403View(WebContant.error403View);
		me.setError404View(WebContant.error404View);
		me.setError500View(WebContant.error500View);
		//Json配置
		me.setJsonFactory(FastJsonFactory.me());
		//开启依赖注入
		me.setInjectDependency(true);
		//附件上传大小设置100M
		me.setMaxPostSize(WebContant.maxPostSize);
	}
	
	/**
	 * 配置JFinal路由映射
	 */
	@Override
	public void configRoute(Routes me) {
		// 配置ControllerBind注解路由
		AutoBindRoutes autoBindRoutes = new AutoBindRoutes();
		autoBindRoutes.includeAllJarsInLib(true);
		autoBindRoutes.setBaseViewPath(WebContant.baseViewPath);
		me.add(autoBindRoutes);
	}
	
	
	public static DruidPlugin createDruidPlugin(String maindb) {
		loadConfig();
		return new DruidPlugin(p.get("mysqljdbcUrl"), p.get("mysqluser"), p.get("mysqlpassword").trim());
	}
	
	/**
	 * 获取数据库插件
	 * 抽取成独立的方法，便于重用该方法，减少代码冗余
	 */
	public static List<DruidPlugin> createDruidPlugin() {
		loadConfig();
		List<DruidPlugin> list = new ArrayList<DruidPlugin>();
		if(p.get("mysqljdbcUrl")!=null) {
			DruidPlugin mysqldbPlugin = new DruidPlugin(p.get("mysqljdbcUrl"), p.get("mysqluser"), p.get("mysqlpassword").trim());
			mysqldbPlugin.setName("mysql");
			list.add(mysqldbPlugin);
		}
		if(p.get("oracledbType")!=null) {
			DruidPlugin oracledbPlugin = new DruidPlugin(p.get("oraclejdbcUrl"), p.get("oracleuser"), p.get("oraclepassword").trim());
			oracledbPlugin.setName("oracle");
			list.add(oracledbPlugin);
		}
		return list;
	}
	
	/**
	 * 配置JFinal插件 数据库连接池 ORM 缓存等插件 自定义插件
	 */
	@Override
	public void configPlugin(Plugins me) {
		List<DruidPlugin> list = createDruidPlugin();
		SqlReporter.setLog(false);
		for(int i = 0;i < list.size();i++) {
		/** 配置druid监控 **/
			list.get(i).addFilter(new StatFilter());
		
		if("oracle".equals(list.get(i).getName())){
			WallFilter oraclewall = new WallFilter();
			//wall.setDbType(p.get("dbType"));
			list.get(i).addFilter(oraclewall);
			// orm映射 配置ActiveRecord插件
			ActiveRecordPlugin oraclearp=new ActiveRecordPlugin("oracle",list.get(i));
			// sql输出
			oraclearp.setShowSql(false);
			// 配置属性名(字段名)大小写,true：小写，false:大写,统一小写，切换oracle数据库的时候可以不用改页面字段
			oraclearp.setContainerFactory(new CaseInsensitiveContainerFactory(false));
			oraclearp.setDialect(new OracleDialect());
			oraclewall.setDbType("oracle");
			_MappingKit.mapping(oraclearp);
			/******** 在此添加数据库 表-Model 映射 *********/
			// 添加到插件列表中
			me.add(list.get(i));
			me.add(oraclearp);
		}else {
			WallFilter wall = new WallFilter();
			//wall.setDbType(p.get("dbType"));
			list.get(i).addFilter(wall);
			// orm映射 配置ActiveRecord插件
			ActiveRecordPlugin arp=new ActiveRecordPlugin("main",list.get(i));
			//sql模板
			arp.getEngine().setSourceFactory(new ClassPathSourceFactory());
			arp.addSqlTemplate(WebContant.sqlTemplate);
			// 代码器模板
			arp.addSqlTemplate(WebContant.codeTemplate);
			// sql输出
			arp.setShowSql(false);
			arp.setDialect(new MysqlDialect());	
			wall.setDbType("mysql");
			_MappingKit.mapping(arp);
			/******** 在此添加数据库 表-Model 映射 *********/
			// 添加到插件列表中
			me.add(list.get(i));
			me.add(arp);
		}	
		}
		// 配置缓存插件
		me.add(new EhCachePlugin());
		//me.add(new Cron4jPlugin());
	}

	/**
	 * 配置全局拦截器
	 */
	@Override
	public void configInterceptor(Interceptors me) {
		me.addGlobalActionInterceptor(new SessionInViewInterceptor());
		me.addGlobalActionInterceptor(new SessionInterceptor());
		me.addGlobalActionInterceptor(new ExceptionInterceptor());
		me.addGlobalActionInterceptor(new TokenInterceptor());
		me.addGlobalActionInterceptor(new LoggerInterceptor());
	}
	
	/**
	 * 配置全局处理器
	 */
	@Override
	public void configHandler(Handlers me) {
		/** 配置druid监控 **/
		me.add(DruidKit.getDruidStatViewHandler()); 
		// 路由处理
		me.add(new CommonHandler());
		// XSS过滤
		me.add(new XssHandler("^\\/portal/form/view.*"));
	}
	
	/**
	 * 配置模板引擎
	 */
	@Override
	public void configEngine(Engine me) {
		// 这里只有选择JFinal TPL的时候才用
		me.setDevMode(p.getBoolean("engineDevMode"));
		// 当前时间指令
		me.addDirective("now", MyNowDirective.class);
		// 项目根路径
		me.addSharedObject("path", JFinal.me().getContextPath());
		// 项目名称
		me.addSharedObject("projectName", p.get("projectName"));
		// 项目版权
		me.addSharedObject("copyright", p.get("copyright"));
		// 配置共享函数模板
		me.addSharedFunction(WebContant.functionTemp);
		
	}

}	
