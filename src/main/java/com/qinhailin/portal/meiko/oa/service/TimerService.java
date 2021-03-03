package com.qinhailin.portal.meiko.oa.service;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;
import com.qinhailin.common.base.service.BaseService;
import com.qinhailin.common.kit.Md5Kit;
import com.qinhailin.common.model.OAMessageTimmer;
import com.qinhailin.common.vo.Grid;

public class TimerService	extends BaseService{
		private OAMessageTimmer dao =  new OAMessageTimmer().dao();
		
		@Override
		public Model<?> getDao() {
			return dao;
		}
		@Override
		public String getDb(){
			return "oracle";
		 }
		
		
		public Grid timerPage(int pageNumber, int pageSize, Record record) {
			Record rd = new Record();		
			rd.set("a.MESS_RUN_WEEK like", record.getStr("MESS_RUN_WEEK"));		
			rd.set("a.MESS_RUN_DAY", record.getStr("MESS_RUN_DAY"));
			rd.set("a.MESS_STATUS", record.getStr("MESS_STATUS"));
			
			//String sql="select * from oa_message a";
			String sql="select * from T_OA_MESSAGE a ";//V_ID_CARD_MESSAGE a";	
			//Db.use("oracle").find("");
			return queryForList(sql,pageNumber, pageSize, rd, " order by a.MESS_STATUS");
		}
		public List<Record> getActiveTimer() {
			
			String sql="select * from T_OA_MESSAGE a where MESS_STATUS=1";			
			return queryForList(sql);
		}
		
		public List<Record> getData(String sql) {					
			return queryForList(sql);
		}

		public boolean saveEntity(OAMessageTimmer timer) {
			return timer.save();
			
		}
		public void updateByIds(int rkey, String dateToString) {
			String sql="update T_OA_MESSAGE set MESS_LAST_SEND_TIME = '"+dateToString+"' where RKEY ="+rkey;
			Db.use("oracle").update(sql);
			
		}
		public void updateUnknowByIds(int rkey) {
			String sql="update T_OA_MESSAGE set MESS_STATUS = -1 where RKEY ="+rkey;
			Db.use("oracle").update(sql);
			
		}
		
		public void deleteByIds(List<String> ids){
			Object[][] paras=new Object[ids.size()][1];
			for(int i=0;i<ids.size();i++) {
				paras[i][0]=ids.get(i);
			}
			String sql="delete from T_OA_MESSAGE where rkey=?";
			Db.use("oracle").batch(sql, paras, 100);
		}
}
