package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.Assist;
import com.entity.BbsBuyer;
import com.entity.BbsDetail;
import com.entity.BbsOrder;
import com.service.Impl.BbsBuyerServiceImpl;
import com.service.Impl.BbsDetailServiceImpl;
import com.service.Impl.BbsOrderServiceImpl;

@Controller
public class orderController {
	@Autowired
	private BbsOrderServiceImpl bbsord;
	@Autowired
	private BbsBuyerServiceImpl bbsbuy;
	@Autowired
	private BbsDetailServiceImpl bbsdet;
	private int pageCount = 10;

	@RequestMapping(value = "/orderGetByPage.do")
	public String getOrderByPage(int page, Map<String, Object> map) {
		Assist assist = new Assist();
		assist.setOrder(Assist.order("id", true));
		int total = (int) bbsord.getBbsOrderRowCount(assist);
		total = Operator.getTotalPage(total, pageCount);
		int currPage = Operator.setCurrPage(page, total);
		assist.setStartRow(currPage * pageCount);
		assist.setRowSize(pageCount);
		List<BbsOrder> ordlist = bbsord.selectBbsOrder(assist);
		map.put("ordlist", ordlist);
		map.put("total", total);
		map.put("currPage", currPage);
		return "console/order/list";
	}

	@RequestMapping(value = "/showOrder")
	public String showOrder(Long id, int page, Map<String, Object> map) {
		BbsOrder ord = bbsord.selectBbsOrderById(id);
		BbsBuyer buy = bbsbuy.selectBbsBuyerById(ord.getBuyerId());
		Assist assist = new Assist();
		assist.setRequires(Assist.andEq("order_id", id));
		int total = (int) bbsdet.getBbsDetailRowCount(assist);
		total = Operator.getTotalPage(total, pageCount);
		int currPage = Operator.setCurrPage(page, total);
		assist.setStartRow(currPage * pageCount);
		assist.setRowSize(pageCount);
		List<BbsDetail> dets = bbsdet.selectBbsDetail(assist);
		map.put("dets", dets);
		map.put("total", total);
		map.put("currPage", currPage);
		map.put("buyer", buy);
		map.put("order", ord);
		return "console/order/view";
	}

	@RequestMapping(value = "/orderType.do")
	public String orderGetByPage(int page, String method, int value, Map<String, Object> map) {
		Assist assist = new Assist();
		assist.setOrder(Assist.order("id", true));
		if (method.equals("Paiy")) {
			assist.setRequires(Assist.andEq("is_paiy", value));
		} else if (method.equals("State")) {
			assist.setRequires(Assist.andEq("order_state", value));
		}
		int total = (int) bbsord.getBbsOrderRowCount(assist);
		total = Operator.getTotalPage(total, pageCount);
		int currPage = Operator.setCurrPage(page, total);
		assist.setStartRow(currPage * pageCount);
		assist.setRowSize(pageCount);
		List<BbsOrder> ordlist = new ArrayList<>();
		try {
			ordlist = bbsord.selectBbsOrder(assist);
		} catch (Exception e) {
			System.out.println("暂无数据");
		}
		map.put("ordlist", ordlist);
		map.put("total", total);
		map.put("currPage", currPage);
		map.put("method", method);
		map.put("value", value);
		return "console/order/methodlist";
	}
}