package com.qinhailin.common.model.base;

import java.util.Date;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOAMessageTimer <M extends BaseOAMessageTimer<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String RKEY) {
		set("RKEY", RKEY);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("RKEY");
	}
	
	public M setMessId(java.lang.String MESS_ID) {
		set("MESS_ID", MESS_ID);
		return (M)this;
	}
	
	public java.lang.String getMessId() {
		return getStr("MESS_ID");
	}
	public M setMESS_RUN_WEEK(java.lang.String MESS_RUN_WEEK) {
		set("MESS_RUN_WEEK", MESS_RUN_WEEK);
		return (M)this;
	}
	
	public java.lang.String getMESS_RUN_WEEK() {
		return getStr("MESS_RUN_WEEK");
	}
	public M setMESS_RUN_DAY(java.lang.String MESS_RUN_DAY) {
		set("MESS_RUN_DAY", MESS_RUN_DAY);
		return (M)this;
	}
	
	public java.lang.String getMESS_RUN_DAY() {
		return getStr("MESS_RUN_DAY");
	}
	public M setMESS_RUN_TIME(String MESS_RUN_TIME) {
		set("MESS_RUN_TIME", MESS_RUN_TIME);
		return (M)this;
	}
	
	public java.lang.String getMESS_RUN_TIME() {
		return getStr("MESS_RUN_TIME");
	}
	public M setMESS_SQL_LIST(String MESS_SQL_LIST) {
		set("MESS_SQL_LIST", MESS_SQL_LIST);
		return (M)this;
	}
	
	public java.lang.String getMESS_SQL_LIST() {
		return getStr("MESS_SQL_LIST");
	}
	public M setMESS_TIMES(String MESS_TIMES) {
		set("MESS_TIMES", MESS_TIMES);
		return (M)this;
	}
	
	public java.lang.String getMESS_TIMES() {
		return getStr("MESS_TIMES");
	}
	public M setMESS_STATUS(Integer integer) {
		set("MESS_STATUS", integer);
		return (M)this;
	}
	
	public int getMESS_STATUS() {
		return getInt("MESS_STATUS");
	}
	public M setMESS_LAST_SEND_TIME(java.lang.String MESS_LAST_SEND_TIME) {
		set("MESS_LAST_SEND_TIME", MESS_LAST_SEND_TIME);
		return (M)this;
	}
	
	public java.lang.String getMESS_LAST_SEND_TIME() {
		return getStr("MESS_LAST_SEND_TIME");
	}
	
}
