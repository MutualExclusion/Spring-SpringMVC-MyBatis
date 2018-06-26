package com.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.Assist;
import com.entity.BbsBrand;
import com.entity.BbsColor;
import com.entity.BbsProduct;
import com.entity.BbsType;
import com.service.Impl.BbsBrandServiceImpl;
import com.service.Impl.BbsColorServiceImpl;
import com.service.Impl.BbsProductServiceImpl;
import com.service.Impl.BbsTypeServiceImpl;

@Controller
public class productController {
	//pageCount表示当前页面展示信息总行数
	private int pageCount = 5;
	@Autowired
	private BbsProductServiceImpl bbspro;
	@Autowired
	private BbsBrandServiceImpl bbsbra;
	@Autowired
	private BbsTypeServiceImpl bbstype;
	@Autowired
	private BbsColorServiceImpl bbscol;
	/**
	 * 展示商品信息
	 * @author NullPointer
	 * @param page 请求到达页数
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/productGetByPage.do")
	public String productGetByPage(int page, Map<String, Object> map) {
		//声明查询帮助类
		Assist arg0 = new Assist();
		//去重
		arg0.setOrder(Assist.order("id", true));
		//返回数据库bbs_product中is_del列等于1的数据(0表删除，1表存在)
		arg0.setRequires(Assist.andEq("is_del", 1));
		//根据查询帮助类返回查询商品总数
		int total = (int) bbspro.getBbsProductRowCount(arg0);
		//根据总行数和每页展示数量得出总页数，用来生成分页
		total = Operator.getTotalPage(total, pageCount);
		//根据总页数和请求页得到正确页码
		int currPage = Operator.setCurrPage(page, total);
		arg0.setStartRow(currPage * pageCount);
		arg0.setRowSize(pageCount);
		//根据帮助类查询的到prolist链表
		List<BbsProduct> prolist = bbspro.selectBbsProduct(arg0);
		//因为商品图片能保存5张，而实际展示在列表页面上只需要一张。所以对所有商品imgUrl截取第一张照片的url地址.
		for (BbsProduct pro : prolist) {
			String img = (String) pro.getImgUrl();
			img = img.split(",")[0];
			pro.setImgUrl(img);
		}
		//声明帮助类
		Assist arg1 = new Assist();
		arg1.setRequires(Assist.andEq("is_del", 1));
		//得到商标链表
		List<BbsBrand> braList = bbsbra.selectBbsBrand(arg1);
		//向request域存放商品信息、商标信息、当前正确页、总页数信息等
		map.put("prolist", prolist);
		map.put("bralist", braList);
		map.put("total", total);
		map.put("currPage", currPage);
		//返回视图层
		return "console/product/list";
	}
	/**
	 * 根据商标查询商品信息
	 * @author NullPointer
	 * @param brandId  商品ID
	 * @param isShow 商品属性--是否上架
	 * @param page 当前页数
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/productByBrand.do")
	public String productByBrand(String brandId, String isShow, int page, Map<String, Object> map) {
		//声明帮助类
		String message = new String();
		Assist arg0 = new Assist();
		//如果查询商标ID为空，则表示查询所有商品
		//如果不为空则表示查询跟选择的商标ID相同的商品
		if(brandId==null||brandId.equals("")){
			message = "所有";
		}else{
			arg0.setRequires(Assist.andEq("brand_id", brandId));
			message = bbsbra.selectBbsBrandById(Long.valueOf(brandId)).getName();
		}
		//如果查询的商品是否上下架为空，则表示查询所有商品，否则反之。
		if(isShow==null||isShow.equals("")){

		}else{
			arg0.setRequires(Assist.andEq("is_show", isShow));
			if(isShow.equals("1")){
				message = message + "上架的";
			}else{
				message = message + "下架的";
			}
		}
		message = message + "商品";
		//如果
		arg0.setRequires(Assist.andEq("is_del", 1));
		//返回所有商品的总数，根据商品的总数来确定当前页面展示总页数和当前商品信息。
		int total = (int) bbspro.getBbsProductRowCount(arg0);
		total = Operator.getTotalPage(total, pageCount);
		//返回当前页数
		int currPage = Operator.setCurrPage(page, total);
		arg0.setStartRow(currPage * pageCount);
		arg0.setRowSize(pageCount);
		List<BbsProduct> prolist = bbspro.selectBbsProduct(arg0);
		//因为商品图片能保存5张，而实际展示在列表页面上只需要一张。所以对所有商品imgUrl截取第一张照片的url地址
		for (BbsProduct pro : prolist) {
			String img = (String) pro.getImgUrl();
			img = img.split(",")[0];
			pro.setImgUrl(img);
		}
		Assist arg1 = new Assist();
		//返回商标查询信息
		List<BbsBrand> braList = bbsbra.selectBbsBrand(arg1);
		//返回当前页面的商品信息
		map.put("prolist", prolist);
		//返回当前页面的商标信息
		map.put("bralist", braList);
		//返回查询信息所展示的商品信息总页数
		map.put("total", total);
		//返回当前页数
		map.put("currPage", currPage);
		//返回当前商标ID
		map.put("brandId", brandId);
		//返回是否展示
		map.put("isShow", isShow);
		//返回视图层
		map.put("message",message);
		return "console/product/likelist";
	}
	/**
	 * 增加商品信息的附属信息，如商标、颜色、类型等
	 * @author NullPointer
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/toProAdd.do")
	public String toAdd(Map<String, Object> map) {
		Assist assist = new Assist();
		List<BbsBrand> brandList = bbsbra.selectBbsBrand(assist);
		List<BbsColor> colorList = bbscol.selectBbsColor(assist);
		List<BbsType> typeList = bbstype.selectBbsType(assist);
		map.put("brandList", brandList);
		map.put("colorList", colorList);
		map.put("typeList", typeList);
		return "console/product/add";
	}
	/**
	 * 添加商品
	 * @author NullPointer
	 * @param typeId 类型Id
	 * @param name 商品名
	 * @param imgUrls 图片
	 * @param brandId 商标ID
	 * @param weight 毛重
	 * @param colors 颜色
	 * @param sizes 尺码
	 * @param isNew 是否新品
	 * @param isShow 是否上架
	 * @param isCommend 是否推荐
	 * @param isHot 是否热卖
	 * @param productDesc 产品描述
	 * @param packageList 包裹清单
	 * @param map
	 * @return 暂时未定
	 */
	@RequestMapping(value="/addProduct.do")
	public String AddProduct(long typeId,String name,String[] imgUrls,long brandId,double weight,String[] colors,String[] sizes,String isNew,String isShow,String isCommend,String isHot,String productDesc,String packageList,Map<String,Object> map){
		BbsProduct pro = new BbsProduct();
		pro.setBrandId(brandId);
		String color = new String();
		for(String temp:colors)
			color = color + temp;
		pro.setColors(color);
		pro.setCreateTime(new Date());
		pro.setDescription(productDesc);
		String imgUrl = new String();
		for(String temp:imgUrls)
			imgUrl = imgUrl+ ","+temp;
		pro.setImgUrl(imgUrl);
		if(isCommend.equals("")){
			pro.setIsCommend(0);
		}else if(isCommend.equals("1")){
			pro.setIsCommend(1);
		}else{
			pro.setIsCommend(0);
		}
		pro.setIsDel(1);
		if(isShow.equals("")){
			pro.setIsShow(0);
		}else if(isShow.equals("1")){
			pro.setIsShow(1);
		}else{
			pro.setIsShow(0);
		}
		if(isHot.equals("")){
			pro.setIsHot(0);
		}else if(isHot.equals("1")){
			pro.setIsHot(1);
		}else{
			pro.setIsHot(0);
		}
		if(isHot.equals("")){
			pro.setIsHot(0);
		}else if(isHot.equals("1")){
			pro.setIsHot(1);
		}else{
			pro.setIsHot(0);
		}
		if(isNew.equals("")){
			pro.setIsNew(0);
		}else if(isNew.equals("1")){
			pro.setIsNew(1);
		}else{
			pro.setIsNew(0);
		}
		if(isNew.equals("")){
			pro.setIsNew(0);
		}else if(isNew.equals("1")){
			pro.setIsNew(1);
		}else{
			pro.setIsNew(0);
		}
		pro.setName(name);
		pro.setPackageList(packageList);
		String size = new String();
		for(String temp:sizes)
			size = size+ ","+temp;
		pro.setSizes(size);
		pro.setWeight(weight);
		bbspro.insertBbsProduct(pro);
		BbsProduct protemp = bbspro.selectBbsProductByObj(pro);
		map.put("proID", protemp.getId());
		System.out.println(pro);
		return "";
	}
	/**
	 * 根据商品ID查询商品信息
	 * @author NullPointer
	 * @param id 商品ID
	 * @param map
	 * @return
	 */
	@RequestMapping("showProduct.do")
	public String showProduct(Long id,Map<String,Object> map){
		//根据商品ID查询商品信息
		BbsProduct pro = bbspro.selectBbsProductById(id);
		String[] imgUrls = String.valueOf(pro.getImgUrl()).split(",");
		pro.setImgUrls(imgUrls);
		//因为商品图片能保存5张，而实际展示在列表页面上只需要一张。所以对所有商品imgUrl截取第一张照片的url地址
		map.put("product", pro);
		return "console/product/update";
	}
}
