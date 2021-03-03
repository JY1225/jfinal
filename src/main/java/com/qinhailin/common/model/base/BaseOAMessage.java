package com.qinhailin.common.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseOAMessage<M extends BaseOAMessage<M>> extends Model<M> implements IBean {
	public M setId(java.lang.String RKEY) {
		set("RKEY", RKEY);
		return (M)this;
	}
	public java.lang.String getId() {
		return getStr("RKEY");
	}
	public M setFactory(java.lang.String factory) {
		set("MESS_FACT", factory);
		return (M)this;
	}
	public java.lang.String getFactory() {
		return getStr("MESS_FACT");
	}
	public M setMessSourid(java.lang.String messSourid) {
		set("MESS_SOURID", messSourid);
		return (M)this;
	}
	public java.lang.String getMessSourid() {
		return getStr("MESS_SOURID");
	}
	public M setMessSystem(java.lang.String messSystem) {
		set("MESS_SYSTEM", messSystem);
		return (M)this;
	}
	public java.lang.String getMessSystem() {
		return getStr("MESS_SYSTEM");
	}
	public M setMessUser(java.lang.String messUser) {
		set("MESS_USER", messUser);
		return (M)this;
	}
	public java.lang.String getMessUser() {
		return getStr("MESS_USER");
	}
	public M setMessDT(java.lang.String messDT) {
		set("MESS_DT", messDT);
		return (M)this;
	}
	public java.lang.String getMessDT() {
		return getStr("MESS_DT");
	}
	public M setMessUG(java.lang.String messUG) {
		set("MESSD_UG", messUG);
		return (M)this;
	}
	public java.lang.String getMessUG() {
		return getStr("MESSD_UG");
	}
	public M setMessdRecipient(java.lang.String MESSD_RECIPIENT) {
		set("MESSD_RECIPIENT", MESSD_RECIPIENT);
		return (M)this;
	}
	public java.lang.String getMessdRecipient() {
		return getStr("MESSD_RECIPIENT");
	}
	public M setMessdMessageData(java.lang.String MESSD_MESSAGE_DATA) {
		set("MESSD_MESSAGE_DATA", MESSD_MESSAGE_DATA);
		return (M)this;
	}
	public java.lang.String getMessdMessageData() {
		return getStr("MESSD_MESSAGE_DATA");
	}
	public M setMessdMessageLink(java.lang.String MESSD_MESSAGE_LINK) {
		set("MESSD_MESSAGE_LINK", MESSD_MESSAGE_LINK);
		return (M)this;
	}
	public String getMessdMessageLink() {
		return getStr("MESSD_MESSAGE_LINK");		 
	}
	public M setMessdStatus(java.lang.String MESSD_STATUS) {
		set("MESSD_STATUS", MESSD_STATUS);
		return (M)this;
	}
	public java.lang.String getMessdStatus() {
		return getStr("MESSD_STATUS");
	}
}
