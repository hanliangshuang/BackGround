package com.foodfun.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCommend<M extends BaseCommend<M>> extends Model<M> implements IBean {

	public void setCommendId(java.lang.String commendId) {
		set("commendId", commendId);
	}

	public java.lang.String getCommendId() {
		return get("commendId");
	}

	public void setFKcommendId(java.lang.String FKcommendId) {
		set("FKcommendId", FKcommendId);
	}

	public java.lang.String getFKcommendId() {
		return get("FKcommendId");
	}

}