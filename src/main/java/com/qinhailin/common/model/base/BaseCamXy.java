package com.qinhailin.common.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

public abstract class BaseCamXy <M extends BaseCamXy<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public M setFileName(java.lang.String fileName) {
		set("file_name", fileName);
		return (M)this;
	}
	
	public java.lang.String getFileName() {
		return getStr("file_name");
	}

	public M setXyx(java.lang.String xyx) {
		set("xy_x", xyx);
		return (M)this;
	}
	
	public java.lang.String getXyx() {
		return getStr("xy_x");
	}

	public M setXyy(java.lang.String xyy) {
		set("xy_y", xyy);
		return (M)this;
	}
	
	public java.lang.String getXyy() {
		return getStr("xy_y");
	}

	public M setDirection(java.lang.String direction) {
		set("direction", direction);
		return (M)this;
	}
	
	public java.lang.String getDirection() {
		return getStr("direction");
	}
}
