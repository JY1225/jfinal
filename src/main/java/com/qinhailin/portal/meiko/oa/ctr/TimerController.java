package com.qinhailin.portal.meiko.oa.ctr;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Record;
import com.qinhailin.common.base.BaseController;
import com.qinhailin.common.model.OAMessageTimmer;
import com.qinhailin.common.routes.ControllerBind;
import com.qinhailin.common.util.StrUtils;
import com.qinhailin.common.vo.Feedback;
import com.qinhailin.portal.core.service.SysOrgService;
import com.qinhailin.portal.core.service.SysUserRoleService;
import com.qinhailin.portal.meiko.oa.service.RealService;
import com.qinhailin.portal.meiko.oa.service.RestWebService;
import com.qinhailin.portal.meiko.oa.service.TimerService;

@ControllerBind(path="/portal/meiko/oa/timer")
public class TimerController extends BaseController{

	@Inject
	TimerService service;
	@Inject
	SysOrgService sysOrgService;
	@Inject
	SysUserRoleService sysUserRoleService;
	public void index() {
		//setAttr("orgList", service.queryOrgIdAndNameRecord());
		render("index.html");
	}


	public void list() {
		Record record = new Record();
		record.set("MESS_RUN_WEEK", getPara("MESS_RUN_WEEK"));		
		record.set("MESS_RUN_DAY", getPara("MESS_RUN_DAY"));
		record.set("MESS_STATUS", getPara("MESS_STATUS"));
		renderJson(service.timerPage(getParaToInt("pageNumber", 1), getParaToInt("pageSize", 10), record));
	}

	public void add() {
		List<Record> flag = new ArrayList<Record>();
		Record rd1 = new Record();
		rd1.set("text", "每天");
		rd1.set("value", "0");
		Record rd2 = new Record();
		rd2.set("text", "每周");
		rd2.set("value", "1");
		Record rd3 = new Record();
		rd3.set("text", "每月");
		rd3.set("value", "2");
		flag.add(rd1);
		flag.add(rd2);
		flag.add(rd3);
		setAttr("orgList", flag);
		render("add.html");
	}

	public void save() {
		OAMessageTimmer oAMessageTimmer=getBean(OAMessageTimmer.class);
		service.saveEntity(oAMessageTimmer);
		List<Record> flag = new ArrayList<Record>();
		Record rd1 = new Record();
		rd1.set("text", "每天");
		rd1.set("value", "0");
		Record rd2 = new Record();
		rd2.set("text", "每周");
		rd2.set("value", "1");
		Record rd3 = new Record();
		rd3.set("text", "每月");
		rd3.set("value", "2");
		flag.add(rd1);
		flag.add(rd2);
		flag.add(rd3);
		setAttr("orgList", flag);
		render("add.html");
	}

	public void edit() throws UnsupportedEncodingException {
		OAMessageTimmer oAMessageTimmer =(OAMessageTimmer) service.findById(URLDecoder.decode(getPara(),"utf-8"));
		setAttr("oAMessageTimmer", oAMessageTimmer);
		List<Record> flag = new ArrayList<Record>();
		Record rd1 = new Record();
		rd1.set("text", "每天");
		rd1.set("value", "0");
		Record rd2 = new Record();
		rd2.set("text", "每周");
		rd2.set("value", "1");
		Record rd3 = new Record();
		rd3.set("text", "每月");
		rd3.set("value", "2");
		flag.add(rd1);
		flag.add(rd2);
		flag.add(rd3);
		setAttr("orgList", flag);
		render("edit.html");
	}

	public void update() {
		OAMessageTimmer oAMessageTimmer=getBean(OAMessageTimmer.class);		
		oAMessageTimmer.update();
		
		//setAttr("sysUser", sysUser);
		//setAttr("orgList", service.queryOrgIdAndNameRecord());
		render("edit.html");
	}

	public void delete() {
		service.deleteByIds(getIds());
		renderJson(Feedback.success());
	}

	public void isAllowLogin() {
		System.out.println("========"+getParaToInt("state"));
		OAMessageTimmer entity = (OAMessageTimmer) service.findById(getPara("id"));
		entity.setMESS_STATUS(getParaToInt("state"));
		service.update(entity);
		renderJson(suc());
	}
	
	/**
     * 定时器 10分钟监听一次
     */
	public void startRun(){
//		ScheduledExecutorService newScheduledThreadPool = Executors
//				.newScheduledThreadPool(3);	
		//定时消息
	     newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
	    	 
	    	 @Override
	    	 public void run() {
	    		 try {
	    			 if(service == null) {
	    				 service = new TimerService();
	    			 }	    			 
	    			 List<Record> timerList = service.getActiveTimer();
	    			 String uptime = StrUtils.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss");
	    			 for(int i = 0; i < timerList.size(); i++) {
	    				 String runTime = timerList.get(i).get("MESS_RUN_TIME");
	    				 
	    				 Date rt = StrUtils.stringToDate(runTime,"yyyy-MM-dd");
	    				 Date nowDate = getNowDate();
	    				 if(!rt.after(nowDate)) {
	    					 String weeks = timerList.get(i).get("MESS_RUN_WEEK");
		    				 String days = timerList.get(i).get("MESS_RUN_DAY");
		    				 if(Arrays.asList(weeks.split("/")).contains(getWeek()) 
		    						 ||Arrays.asList(days.split("/")).contains(getDate())) {
		    					 
		    					 String times = timerList.get(i).get("MESS_TIMES");
		    					 String[]  str = times.split("/");
		    					 if(Arrays.asList(str).contains(getTime())) {
		    						 //if(true) {	 
		    						 String sql = timerList.get(i).get("MESS_SQL_LIST");
		    						 List<Record> datas = service.getData(sql);
		    						 String[] loginNames = new String[1];
		    						 String[] urls = new String[loginNames.length];
		    						 for(int j = 0;j<datas.size();j++) {
		    							 loginNames[0] = datas.get(j).get("接收人");
		    							 urls[0] = datas.get(j).get("链接地址");
		    							 Map<String, Object> data = new HashMap<String, Object>();
		    							 data.put("senderLoginName", datas.get(j).get("发送人"));
			    					     data.put("loginNames", loginNames); 
			    					     data.put("content",datas.get(j).get("消息内容")); 
			    					     data.put("url", urls);
			    					     
			    					     Object object = timerList.get(i).get("RKEY");
		    					    	 int rkey = Integer.valueOf(String.valueOf(object));
		    					    	 
			    					     if(data !=null && RestWebService.getInstence().mesPost(data)=="1") {			    					    	 
			    					    	 service.updateByIds(rkey,uptime);
			    					     }else {
			    					    	 service.updateUnknowByIds(rkey);
			    					     }
		    						 }
		    						 
		    					 }		    					 
		    				 }
	    				 }
	    			 }
	    			 
		    	   }catch(Exception e){		    		   
		    		   //e.printStackTrace();
		    		   System.err.println(e.toString());
		    	   }
	    	 }
	    	 }, 0, 60, TimeUnit.SECONDS);
	   }
		
	public Date getNowDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Date rt = StrUtils.stringToDate(df.format(new Date()),"yyyy-MM-dd");
		return rt;
	}
	
	private String getWeek() {
		String week = "";
		Date today = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(today);
		int weekday = c.get(Calendar.DAY_OF_WEEK);
		if (weekday == 1) {
			week = "7";//"周日";
		} else if (weekday == 2) {
			week = "1";//"周一";
		} else if (weekday == 3) {
			week = "2";//"周二";
		} else if (weekday == 4) {
			week = "3";//"周三";
		} else if (weekday == 5) {
			week = "4";//"周四";
		} else if (weekday == 6) {
			week = "5";//"周五";
		} else if (weekday == 7) {
			week = "6";//"周六";
		}
		return week;
	}
	
	/**
	 * 
	 * @return "dd"
	 */
	public String getDate() {
		Calendar  rightNow = Calendar.getInstance(); 
		return String.valueOf(rightNow.get(Calendar.DAY_OF_MONTH));
	}
	/**
	 * 
	 * @return "hh:mm"
	 */
	public String getTime() {
		Calendar  rightNow = Calendar.getInstance();
		String hh = String.valueOf(rightNow.get(Calendar.HOUR_OF_DAY));		
		if(hh.length() == 1) {
			hh="0"+hh;
		}
		String mm = String.valueOf(rightNow.get(Calendar.MINUTE));
		if(mm.length() == 1) {
			mm="0"+mm;
		}
		return hh+":"+mm;
	}
	
	/**
	 * 用户角色
	 */
	public void userRole(){
		setAttr("userCode", getPara("userCode"));
		setAttr("userName",getPara("userName"));
		render("userRole.html");
	}
	
	
	/**
	 * 查询用户角色
	 */
	public void queryUserRole(){
		renderJson(sysUserRoleService.queryUserRoleList(getPara("userCode")));
	}
	
	 public static void main(String[] args) {
		 System.out.println(Pattern.matches("^(?!.*?发送人).*$|^(?!.*?接收人).*$", "发送人接收"));
	        System.out.println(Pattern.matches("^((?!发送人).)*$|^((?!接收人).)*$|^((?!消息内容).)*$|^((?!链接地址).)*$", "select '03-03132' 发送人, '19-51202' 接收人, '定时消息test' 消息内容, '' 链接地址 from T_OA_MESSAGE"));

	    }
}
