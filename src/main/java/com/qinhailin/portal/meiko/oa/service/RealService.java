package com.qinhailin.portal.meiko.oa.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;
import com.qinhailin.common.base.service.BaseService;
import com.qinhailin.common.model.OAMessage;
import com.qinhailin.common.vo.Grid;

public class RealService extends BaseService{
	private OAMessage dao =  new OAMessage().dao();
	
	@Override
	public Model<?> getDao() {
		return dao;
	}
	@Override
	public String getDb(){
		return "oracle";
	 }
	
	public Grid page(int pageNumber, int pageSize, Record record) {
		Record rd = new Record();		
		rd.set("a.MESS_USER like", record.getStr("MESS_USER"));		
		rd.set("a.MESSD_MESSAGE_DATA like", record.getStr("MESSD_MESSAGE_DATA"));
		rd.set("a.MESSD_STATUS =", record.getStr("MESSD_STATUS"));
		//String sql="select * from oa_message a";
		String sql="select * from T_OA_MESSAGE_IF_DATA a ";//V_ID_CARD_MESSAGE a";	
		//Db.use("oracle").find("");
		return queryForList(sql,pageNumber, pageSize, rd, " order by a.MESSD_STATUS");
	}
	
	
	public List<Record> seleByGroup(String strings) {
		String groups="";
		if(strings.contains(",")) {
			for(int i = 0; i < strings.split(",").length; i++) {
				if(i == strings.split(",").length-1) {
					groups+="'"+strings.split(",")[i]+"'";
				}else {
					groups+="'"+strings.split(",")[i]+"',";
				}
			}
		}else {
			groups = "'"+strings+"'";
		}
		
		String sql="SELECT member_code from T_OA_ORG_BG_MEMBER where GROUP_ID in (select GROUP_ID from T_OA_ORG_BGROUP where GROUP_NAME in("+groups+"))";
		return queryForList(sql);
	}
	
	/**
	 * 
	 * @param strings
	 * @return
	 */
	public List<Record> seleAllId() {				
		String sql="SELECT rkey from T_OA_MESSAGE_IF_DATA where MESSD_STATUS = 0";
		return queryForList(sql);
	}
	
	public void deleteByIds(List<String> ids){
		Object[][] paras=new Object[ids.size()][1];
		for(int i=0;i<ids.size();i++) {
			if(!"superadmin".equals(ids.get(i).toLowerCase())
					&&!"admin".equals(ids.get(i).toLowerCase())){
				paras[i][0]=ids.get(i);				
			}
		}
		
		String sql="delete from T_OA_MESSAGE_IF_DATA where RKEY =?";//V_ID_CARD_MESSAGE where id=?";
		Db.use("oracle").batch(sql, paras, 50);
	}
	
	public void updateByIds(String id){
		
		String sql="update T_OA_MESSAGE_IF_DATA set MESSD_STATUS = 1 where RKEY ="+id;
		Db.use("oracle").update(sql);
	}
	
	public void updateUnknowByIds(String string){
		
		String sql="update T_OA_MESSAGE_IF_DATA set MESSD_STATUS = -1 where RKEY ="+string;
		int i = Db.use("oracle").update(sql);
		//System.out.println(i);
	}
	
}