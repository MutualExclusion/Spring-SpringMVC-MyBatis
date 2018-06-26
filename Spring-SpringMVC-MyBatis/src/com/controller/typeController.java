package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.Assist;
import com.entity.BbsProType;
import com.entity.BbsProduct;
import com.entity.BbsType;
import com.service.Impl.BbsProTypeServiceImpl;
import com.service.Impl.BbsProductServiceImpl;
import com.service.Impl.BbsTypeServiceImpl;

@Controller
public class typeController {
	@Autowired
	private BbsTypeServiceImpl bbstype;
	@Autowired
	private BbsProTypeServiceImpl bbspty;
	@Autowired
	private BbsProductServiceImpl bbspro;
	private int pageCount = 10;

	@RequestMapping(value = "/typeGetByPage.do")
	public String typeGetByPage(int page, Map<String, Object> map) {
		Assist assist = new Assist();
		assist.setOrder(Assist.order("id", true));
		int total = (int) bbstype.getBbsTypeRowCount(assist);
		total = Operator.getTotalPage(total, pageCount);
		int currPage = Operator.setCurrPage(page, total);
		assist.setStartRow(currPage * pageCount);
		assist.setRowSize(pageCount);
		List<BbsType> typelist = bbstype.selectBbsType(assist);
		map.put("typelist", typelist);
		map.put("total", total);
		map.put("currPage", currPage);
		return "console/type/list";
	}
	@RequestMapping(value="/showProType.do")
	public String showProType(long id,int page,Map<String ,Object> map){
		Assist arg0 = new Assist();
		arg0.setRequires(Assist.andEq("type_id", id));
		int total = (int) bbspty.getBbsProTypeRowCount(arg0);
		total = Operator.getTotalPage(total, pageCount);
		int currPage = Operator.setCurrPage(page, total);
		arg0.setStartRow(currPage * pageCount);
		arg0.setRowSize(pageCount);
		
		return "console/type/view";
	}
	

	@RequestMapping(value = "/deleteType.do")
	public void deleteBrand(Long id, HttpServletResponse response) throws IOException {
		bbstype.deleteBbsTypeById(id);
		Assist arg0 = new Assist();
		arg0.setRequires(Assist.andEq("type_id", id));
		List<BbsProType> list = bbspty.selectBbsProType(arg0);
		for (BbsProType temp : list) {
			Assist args = new Assist();
			args.setRequires(Assist.andEq("id", temp.getProductId()));
			BbsProduct pro = (BbsProduct) bbspro.selectBbsProduct(args);
			pro.setIsDel(0);
			bbspro.updateBbsProductById(pro);
			bbspty.deleteBbsProTypeById(temp.getId());
		}
		try {
			response.sendRedirect("typeGetByPage.do?page=0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/showType.do")
	public String showType(Long id, Map<String, Object> map) {
		BbsType type = bbstype.selectBbsTypeById(id);
		map.put("Type",type);
		return "console/type/view";
	}
	@RequestMapping(value = "/addType.do")
	public String addType(String name,String imgUrl,Map<String,Object> map){
		BbsType type = new BbsType();
		type.setImgUrl(imgUrl);
		type.setName(name);
		bbstype.insertBbsType(type);
		map.put("message","类型添加成功！");
		return "console/type/info";
	}
	@RequestMapping(value="/toAddType")
	public String toAddType(Map<String ,Object> map){
		return "console/type/add";
	}
	@RequestMapping(value="/updateType.do")
	public String updateType(Long id,String name,String imgUrl,Map<String,Object> map){
		BbsType type = bbstype.selectBbsTypeById(id);
		type.setImgUrl(imgUrl);
		type.setName(name);
		bbstype.updateBbsTypeById(type);
		map.put("message", "类别修改成功！");
		return "console/type/info";
	}
}
