package com.qinhailin.portal.meiko.oa.ctr;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Record;
import com.qinhailin.common.base.BaseController;
import com.qinhailin.common.entity.Member;
import com.qinhailin.common.model.OAMessage;
import com.qinhailin.common.routes.ControllerBind;
import com.qinhailin.common.vo.Feedback;
import com.qinhailin.portal.meiko.oa.service.RealService;
import com.qinhailin.portal.meiko.oa.service.RestWebService;
import com.seeyon.ctp.common.usermessage.MessageContent;


@ControllerBind(path="/portal/meiko/oa/id_deadline")
public class RealController extends BaseController{

	@Inject
	RealService service;

	public void index() {
		render("index.html");
	}
	
	public void list() {
		Record record = new Record();		 
		record.set("MESS_USER", getPara("MESS_USER"));
		record.set("MESSD_MESSAGE_DATA", getPara("MESSD_MESSAGE_DATA"));
		record.set("MESSD_STATUS", getPara("MESSD_STATUS"));
		renderJson(service.page(getParaToInt("pageNumber", 1), getParaToInt("pageSize", 10), record));
	}
	
	@SuppressWarnings({ "rawtypes", "unused" })
	public void delete() {
		List lists = getIds();
		service.deleteByIds(getIds());
		renderJson(Feedback.success());
	}
	
	/**
	 * 页面点击发送按钮触发
	 */
	public void send() {		
		List<String> list = getIds();
		String id = list.get(0);
		OAMessage message = (OAMessage)service.findById(id);
		Map<String, Object> data = getData(message);
		Member sender = RestWebService.getInstence().getUser(message.getMessUser());
		if(sender == null) {
			service.updateUnknowByIds(message.getId());
			renderJson(Feedback.success("发件人无效"));//发送人无效
		}
		else if(data !=null && RestWebService.getInstence().mesPost(data)=="1") {
			service.updateByIds(message.getId());
			renderJson(Feedback.success("发送成功"));			
		}else {
			service.updateUnknowByIds(message.getId());
			renderJson(Feedback.success("发送失败，检查接收人是否有效"));
		}
	}
	
	/**
	 * 发送所有未发送的消息
	 */
	public void sendAll() {		
		List<Record> ids = service.seleAllId();
		for(int i = 0; i < ids.size();i++) {
			String id = ids.get(i).getStr("RKEY");
			OAMessage message = (OAMessage)service.findById(id);
			Map<String, Object> data = getData(message);
			if(data !=null && RestWebService.getInstence().mesPost(data)=="1") {
				service.updateByIds(message.getId());	
			}else {
				//发送失败，发件人或收件人无效
				service.updateUnknowByIds(message.getId());
			}
		}		
	}

	public Map<String, Object> getData(OAMessage message) {		
		Map<String, Object> data = new HashMap<String, Object>();
		String senderLoginName = message.getMessUser();//"03-03132";//发起人 
		Member sender = RestWebService.getInstence().getUser(message.getMessUser());
		if(sender == null) {
			//service.updateUnknowByIds(message.getId());
			return null;//发送人无效
		}
		String[] loginNames = null;
		if(message.getMessUG().equalsIgnoreCase("u")) {
			if(message.getMessdRecipient().contains(",")) {
				loginNames = message.getMessdRecipient().split(",");
			}else {
					loginNames = new String[1];
			        Member m = RestWebService.getInstence().getUser(message.getMessdRecipient());
					if(m != null) {
						loginNames[0] = message.getMessdRecipient();
					}else {
						//service.updateUnknowByIds(message.getId());
						return null;//接收人无效
					}
					//(String[]) list.toArray(new String[list.size()]);
				}
		}else if(message.getMessUG().equalsIgnoreCase("g")){
				List<Record> menbers = service.seleByGroup(message.getMessdRecipient());
				loginNames = new String[menbers.size()];
				for(int i = 0; i < menbers.size();i++) {
					loginNames[i] = menbers.get(i).getStr("MEMBER_CODE");
			}				
		}
        String content = message.getMessdMessageData();
        String[] urls = new String[loginNames.length];
        for(int i = 0; i < urls.length;i++) {
        	if(message.getMessdMessageLink() != null) {
        		urls[i] = message.getMessdMessageLink().trim();
        	}else {
        		urls[i] = "";
        	}
        }

        data.put("senderLoginName", senderLoginName);
        data.put("loginNames", loginNames); 
        data.put("content",content); 
        data.put("url", urls);
        return data;
	}
	

    /**
     * 定时器 内部系统实时消息发送，2秒监听一次
     */
	public void startRun(){
//		ScheduledExecutorService newScheduledThreadPool = Executors
//				.newScheduledThreadPool(3);	
		//实时消息
	     newScheduledThreadPool.scheduleAtFixedRate(new Runnable() {
	    	 
	    	 @Override
	    	 public void run() {
	    		 try {
	    			 if(service == null) {
	    				 service = new RealService();
	    			 }	    			 
	    			 sendAll();
	    			 //System.err.println("内部系统实时消息发送，2秒监听一次");
		    	   }catch(Exception e){		    		   
		    		   e.printStackTrace();
		    	   }
	    	 }
	    	 }, 2, 2, TimeUnit.SECONDS);
	   }
	
	public static void main(String[] args) {
		//startRun();
	}
	
}
