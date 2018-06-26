package com.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.common.Assist;
import com.entity.BbsAdmin;
import com.service.Impl.BbsAdminServiceImpl;

@Controller
@SessionAttributes("admin")
public class adminController {
	@Autowired
	private BbsAdminServiceImpl bbsadm;
	private int pageCount = 10;
	@RequestMapping("/adminLogin")
	public void login(Long id, String psd, HttpSession session, HttpServletRequest req,HttpServletResponse resp)
			throws IOException, ServletException {
		BbsAdmin admin = bbsadm.selectBbsAdminById(id);
		if (admin==null) {
			System.out.println("账号不存在！");
			resp.getWriter().write("1");
		} else if(admin!=null&&!admin.getPassword().equals(psd)){
			System.out.println("密码错误！");
			resp.getWriter().write("2");
		} else if(admin!=null&&admin.getPassword().equals(psd)){
			System.out.println("登录成功！");
			session.setAttribute("admin", admin);
			resp.getWriter().write("3");
		}
	}
	@RequestMapping("/adminGetByPage.do")
	public String adminGetByPage(int page, Map<String, Object> map) {
		Assist assist = new Assist();
		assist.setOrder(Assist.order("id", true));
		int total = (int) bbsadm.getBbsAdminRowCount(assist);
		total = Operator.getTotalPage(total, pageCount);
		int currPage = Operator.setCurrPage(page, total);
		assist.setStartRow(currPage * pageCount);
		assist.setRowSize(pageCount);
		List<BbsAdmin> admlist = bbsadm.selectBbsAdmin(assist);
		map.put("admlist", admlist);
		map.put("total", total);
		map.put("currPage", currPage);
		return "console/admin/list";
	}
	@RequestMapping("/logout.do")
	public String logout(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		session.removeAttribute("admin");
		session.invalidate();
		return "adminLogin";
	}
	@RequestMapping(value="/showAdmin")
	public String showAdmin(long id,Map<String,Object> map){
		BbsAdmin admin = bbsadm.selectBbsAdminById(id);
		System.out.println(admin);
		map.put("tempValue", admin);
		return "console/admin/view";
	}
	@RequestMapping(value="/updataAdminInfo_find.do")
	public String updataAdminInfo(String imgUrl,String pwd,HttpServletRequest req,Map<String,Object> map){
		BbsAdmin admin = (BbsAdmin) req.getSession().getAttribute("admin");
		admin.setImgUrl(imgUrl);
		admin.setPassword(pwd);
		bbsadm.updateBbsAdminById(admin);
		System.out.println(admin);
		map.put("site", "个人信息管理");
		map.put("message", "修改成功！");
		return "console/info";
	}
	@RequestMapping(value="/admininfo.do")
	public String adminInfo(Map<String, Object> map){
		return "console/admin/admininfo";
	}
	@RequestMapping(value="/toAddAdmin.do")
	public String toAddAdmin(Map<String,Object> map){
		return "console/admin/add";
	}
	@RequestMapping(value="/addAdmin.do")
	public String addAdmin(long id,String name,String realName,String gender,String imgUrl,int power,String email,String pwd,String phone,Map<String,Object> map){
		BbsAdmin admin = new BbsAdmin();
		admin.setEmail(email);
		if(gender.equals("1")){
			admin.setGender(1);
		}else if(gender.equals("2")){
			admin.setGender(2);
		}else{
			admin.setGender(0);
		}
		admin.setId(id);
		admin.setImgUrl(imgUrl);
		admin.setName(name);
		admin.setPassword(pwd);
		admin.setPhone(phone);
		admin.setPower(0);
		admin.setRealName(realName);
		admin.setRegisterTime(new Date());
		bbsadm.insertBbsAdmin(admin);
		System.out.println(admin);
		map.put("site", "管理员管理");
		map.put("message","添加成功！");
		return "console/info";

	}






}
