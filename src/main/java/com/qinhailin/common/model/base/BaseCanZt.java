package com.qinhailin.common.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

public abstract class BaseCanZt <M extends BaseCanZt<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setZtName(java.lang.String ztName) {
		set("zt_name", ztName);
		return (M)this;
	}
	
	public java.lang.String getZtName() {
		return getStr("zt_name");
	}

	public M setZtType(java.lang.String ztType) {
		set("zt_type", ztType);
		return (M)this;
	}
	
	public java.lang.String getZtType() {
		return getStr("zt_type");
	}

	public M setZtDiameter(java.lang.String ztDiameter) {
		set("zt_diameter", ztDiameter);
		return (M)this;
	}
	
	public java.lang.String getZtDiameter() {
		return getStr("zt_diameter");
	}

}
