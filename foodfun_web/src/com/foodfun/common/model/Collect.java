package com.foodfun.common.model;

import com.foodfun.common.model.base.BaseCollect;
import com.jfinal.plugin.activerecord.Page;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Collect extends BaseCollect<Collect> {
	public static final Collect dao = new Collect();
	
	public Page<Collect> paginate(int pageNumber, int pageSize) {
		return paginate(pageNumber, pageSize, "select *", "from collect");
	}
}
