package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.Assist;
import com.entity.BbsSku;
import com.service.Impl.BbsColorServiceImpl;
import com.service.Impl.BbsSkuServiceImpl;

@Controller
public class skuController {
	@Autowired
	private BbsSkuServiceImpl bbssku;
	@Autowired
	private BbsColorServiceImpl bbscol;
	private int pageCount = 10;

	@RequestMapping(value = "/getSku.do")
	public String getSkuByPage(int page, Long productId, Map<String, Object> map) {
		Assist assist = new Assist();
		assist.setOrder(Assist.order("id", true));
		assist.setRequires(Assist.andEq("product_id", productId));
		int total = (int) bbssku.getBbsSkuRowCount(assist);
		total = Operator.getTotalPage(total, pageCount);
		int currPage = Operator.setCurrPage(page, total);
		assist.setStartRow(currPage * pageCount);
		assist.setRowSize(pageCount);
		List<BbsSku> skulist = bbssku.selectBbsSku(assist);

		map.put("skuList", skulist);
		map.put("total", total);
		map.put("currPage", currPage);
		map.put("productId", productId);
		return "console/sku/list";
	}
}
