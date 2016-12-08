package com.foodfun.funcollect;

import java.util.List;

import com.foodfun.common.model.Collect;
import com.foodfun.common.model.Funcollect;
import com.foodfun.common.model.Mclassify;
import com.foodfun.common.model.Test;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

/**
 * BlogController
 * 锟斤拷锟斤拷 sql 锟斤拷业锟斤拷锟竭硷拷写锟斤拷 Model 锟斤拷 Service 锟叫ｏ拷锟斤拷要写锟斤拷 Controller 锟叫ｏ拷锟斤拷锟缴猴拷习锟竭ｏ拷锟斤拷锟斤拷锟节达拷锟斤拷锟斤拷目锟侥匡拷锟斤拷锟斤拷维锟斤拷
 */
//@Before(BlogInterceptor.class)
public class FuncollectController extends Controller {
	public void index() {
		setAttr("testPage", Funcollect.dao.paginate(getParaToInt(0, 1), 20));
		render("funcollect.html");
	}

	public void add() {
		
	}
	
	
	public void save() {
		getModel(Funcollect.class).save();
		redirect("/funcollect");
	}
	
	public void edit() {
		setAttr("funcollect", Funcollect.dao.findById(getParaToInt()));
	}
	
	public void update() {
		getModel(Funcollect.class).update();
		redirect("/funcollect");
	}
	
	public void delete() {
		Funcollect.dao.deleteById(getParaToInt());
		redirect("/funcollect");
	}
}