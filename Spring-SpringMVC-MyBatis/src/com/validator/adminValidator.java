package com.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.entity.BbsAdmin;
import com.service.Impl.BbsAdminServiceImpl;

@Repository("adminValidator")
public class adminValidator implements Validator{
	@Autowired
	private BbsAdminServiceImpl bbsadm;
	//该校验器能够对clazz类型对象进行校验
	@Override
	public boolean supports(Class<?> arg0) {
		//BbsAdmin指定Class参数所表示的类或接口是否相同，或是否是其超类或超接口
		return BbsAdmin.class.isAssignableFrom(arg0);
	}
	//对目标类obj进行校验，并将校验错误记录在errors当中
	@Override
	public void validate(Object obj, Errors errors) {
		/**
		 * 使用ValidationUtils中的一个静态方法rejectIfEmpty()来对admin属性进行校验，如果属性为空就拒绝验证通过
		 */
		ValidationUtils.rejectIfEmpty(errors, "adminid", null,"请输入登录账号");
		ValidationUtils.rejectIfEmpty(errors, "adminpsd", null,"密码不能为空");
		BbsAdmin admin = (BbsAdmin)obj;
		String psd = bbsadm.selectBbsAdminById(admin.getId()).getPassword();
		if(!admin.getPassword().equals(psd)){
			errors.rejectValue("adminpsd", null,"密码错误");
		}
	}

}
