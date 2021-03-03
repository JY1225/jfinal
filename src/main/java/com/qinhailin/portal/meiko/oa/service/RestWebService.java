package com.qinhailin.portal.meiko.oa.service;

import java.util.HashMap;
import java.util.Map;

import com.qinhailin.common.entity.Member;
import com.seeyon.client.CTPRestClient;
import com.seeyon.client.CTPServiceClientManager;

public class RestWebService{
	private Object obj = new Object();
    //REST用户登录名
	private String userName = "meikosoft";//seeyon,meikosoft
    //REST用户密码
    private String password = "c2c73632-9f59-4470-9861-b55cb3d40668";
    //"e6c10f92-cbd7-47eb-ab82-99e3fbd30f86";//正式
    //"34c2929c-188d-438a-a259-3bc4e76f97f1";//测试 
    private String url = "http://10.30.10.101:8089";
    //"http://10.30.10.101:8089";//正式内网   
    //"http://14.18.105.35:8089";//正式外网
    //测试
    //"http://192.1.8.56:8089";
    
    //定义REST动态客户机
    private CTPRestClient client = null;
    /** 验证服务对象 */
    private static RestWebService authorityService = null;
    /**
     * 单例对象,私有化构造函数
     */
    private RestWebService() {
    }
    /**
     * 获取实体对象
     * @return
     */
    public static RestWebService getInstence() {
        if(authorityService == null) {
            authorityService = new RestWebService();
        }
        return authorityService;
    }
    /**
     * 验证权限
     * @return 验证结果
     */
    public boolean authenticate() {
    	try {
    		Thread.sleep(200);   		
    		// 取得指定服务主机的客户端管理器。
    		// 参数为服务主机地址，包含{协议}{Ip}:{端口}，如http://127.0.0.1:8088
    		CTPServiceClientManager clientManager = CTPServiceClientManager.getInstance(url);
        	// 取得REST动态客户机。
        	client = clientManager.getRestClient();
        	// 登录校验,成功返回true,失败返回false,此过程并会把验证通过获取的token保存在缓存中
        	// 再请求访问其他资源时会自动把token放入请求header中。
        	//System.out.println("=============认证=========");
        	return client.authenticate(userName, password);
    	}catch(Exception e) {
    		System.out.println("=============认证失败=========");
    		e.printStackTrace();
    		return false;
    	}       
    }
    /**
     * 获取client
     * @return client
     */
    public CTPRestClient getClient() {
        return client;
    }
    /**
     * 设置client
     * @param client client
     */
    public void setClient(CTPRestClient client) {
        this.client = client;
    }
	
	  /**
     * 获取员工信息
     * @return String
     */
    public Member getUser(String loginName){
    	//String token = client.get("token/" + userName + "/" + password, String.class,"text/plain");
    	Member member = null;
    	if(authenticate()) {
    		member = client.get("orgMember?loginName="+loginName, Member.class);
    	}else {
    		getUser(loginName);
    	} 
    	//Member member = client.get("orgMember?loginName="+loginName+ "&token=" + token, Member.class);    	
         return member;       
    }
    /**
     * 获取员工消息
     * @return String
     */
    public String getMes(){
    	return client.get("message/all/8357136202217504773?pageNo=1&pageSize=20", String.class);          
      }
    
    /**
     * 修改员工信息已读状态
     * @return String
     */
	public String isread(){
    	Map<String, Object> res = new HashMap<String, Object>();
    	  String userid ="8357136202217504773";
    	  String[] messageid ={"-7359123878775337555"};
    	  res.put("userid", userid);
    	  res.put("messageid", messageid); 
    	  return client.post("message/isread",res, String.class);          
      }
    
	/**
     * 发送协同消息
     * @return String
     */
	public String mesPost(Map<String, Object> data){

		synchronized (obj){
			if(authenticate()) {
				 client.post("message/loginName",data, String.class);
				 return "1";
			}else {
				mesPost(data);
			}
		}
		return "0";
    }
	
	public static void main(String[] args) {
		System.out.println(RestWebService.getInstence().authenticate());
	}
}