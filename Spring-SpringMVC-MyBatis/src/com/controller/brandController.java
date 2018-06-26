package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.Assist;
import com.entity.BbsBrand;
import com.entity.BbsProduct;
import com.service.Impl.BbsBrandServiceImpl;
import com.service.Impl.BbsProductServiceImpl;

@Controller
public class brandController {
	@Autowired
	private BbsBrandServiceImpl bbsbra;
	@Autowired
	private BbsProductServiceImpl bbspro;

	private int pageCount = 8;
	/**展示商标信息(对所有成员隐藏删除项，对于1级管理员来说，也不可见)
	 * @author NullPointer
	 * @param page 请求页
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/brandGetByPage.do")
	public String getBrandByPage(int page, Map<String, Object> map) {
		//实例化查询帮助类
		Assist assist = new Assist();
		//设置排序
		assist.setOrder(Assist.order("id", true));
		//对所有成员隐藏删除项
		assist.setRequires(Assist.andEq("is_del", 1));
		int total = (int) bbsbra.getBbsBrandRowCount(assist);
		total = Operator.getTotalPage(total, pageCount);
		int currPage = Operator.setCurrPage(page, total);
		assist.setStartRow(currPage * pageCount);
		assist.setRowSize(pageCount);
		List<BbsBrand> bralist = bbsbra.selectBbsBrand(assist);
		map.put("bralist", bralist);
		map.put("total", total);
		map.put("currPage", currPage);
		//返回列表视图
		return "console/brand/list";
	}
	/**
	 * 到达添加页(更改建议:设置动态，负责多个转发)
	 * @author NullPointer
	 * @return
	 */
	@RequestMapping(value = "/toAddBrand.do")
	public String toAddBrand(){
		return "console/brand/add";
	}
	/**
	 * 添加商标信息(目前该表单无验证信息)
	 * @author NullPointer
	 * @param name 商标名
	 * @param imgUrl 图片imgUrl
	 * @param description 商标描述
	 * @param sort 排序
	 * @param isDisplay 是否展示
	 * @param webSite 网站URL
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/addBrand.do")
	public String addBrand(String name,String imgUrl,String description,int sort,String isDisplay,String webSite,Map<String,Object> map) {
		//初始化商标类
		BbsBrand bra = new BbsBrand();
		//设置商标属性
		bra.setDescription(description);
		bra.setImgUrl(imgUrl);
		bra.setIsDel(1);
		if(isDisplay.equals("")){
			bra.setIsDisplay(0);
		}else{
			bra.setIsDisplay(1);
		}
		bra.setIsDel(1);
		bra.setName(name);
		bra.setSort(sort);
		bra.setWebSite(webSite);
		//增加商标信息，持久化数据。
		bbsbra.insertBbsBrand(bra);
		map.put("message", "商品添加成功");
		return "console/brand/info";
	}
	/**
	 * 删除商标信息(对于一级管理员有权利删除商标的信息，但是由于实现简单，本系统先暂时不做更改。即所有的管理员都不可以删除商标信息。)
	 * @author NullPointer
	 * @param id
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/deleteBrand.do")
	public void deleteBrand(String id, HttpServletResponse response) throws IOException {
		//通过商标ID查询商标信息
		BbsBrand bra = bbsbra.selectBbsBrandById(Long.valueOf(id));
		//更改商标信息属性
		bra.setIsDel(0);
		//更新
		bbsbra.updateBbsBrandById(bra);
		//返回商标信息列表
		Assist assist = new Assist();
		assist.setRequires(Assist.andEq("brand_id", id));
		List<BbsProduct> pros = bbspro.selectBbsProduct(assist);
		for (BbsProduct pro : pros) {
			pro.setIsDel(0);
			bbspro.updateBbsProductById(pro);
			System.out.println(pro.toString());
		}
		try {
			response.sendRedirect("brandGetByPage.do?page=0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value="/updateBra.do")
	public String updateBra(long id,Map<String , Object> map){
		BbsBrand bra = bbsbra.selectBbsBrandById(id);
		System.out.println(bra);
		map.put("brand", bra);
		return "console/brand/edit";
	}
	/**
	 * 更新商标信息
	 * @author NullPointer
	 * @param id 商标Id
	 * @param name
	 * @param imgUrl
	 * @param description
	 * @param sort
	 * @param isDisplay
	 * @param webSite
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/updataBrand.do")
	public String udataBrand(long id,String name,String imgUrl,String description,int sort,String isDisplay,String webSite,Map<String,Object> map){
		BbsBrand bra = new BbsBrand();
		bra.setDescription(description);
		bra.setImgUrl(imgUrl);
		bra.setIsDel(1);
		if(isDisplay.equals("")){
			bra.setIsDisplay(0);
		}else{
			bra.setIsDisplay(1);
		}
		bra.setId(id);
		bra.setIsDel(1);
		bra.setName(name);
		bra.setSort(sort);
		bra.setWebSite(webSite);
		bbsbra.updateBbsBrandById(bra);
		System.out.println(bra);
		map.put("message", "商表修改成功");
		return "console/brand/info";

	}
}
