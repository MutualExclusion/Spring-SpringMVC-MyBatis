package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.entity.BbsAdmin;


public class adminInterceptor implements HandlerInterceptor{
	private static final String[] IGNORE_URI = {"/adminLogin"};
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		boolean flag = false;
		String servletPath = arg0.getServletPath();
		for(String s:IGNORE_URI){
			if(servletPath.contains(s)){
				flag = true;
				break;
			}
		}
		if(!flag){
			BbsAdmin admin = (BbsAdmin) arg0.getSession().getAttribute("admin");
			if(admin == null){
				System.out.println("adminInterceptor拦截请求;");
				arg0.setAttribute("message", "请先登录再访问本站！");
				arg0.getRequestDispatcher("adminLogin.jsp").forward(arg0, arg1);
			}else{
				System.out.println("adminInterceptor放行请求;");
				flag =true;
			}
		}
		return flag;
	}



}
