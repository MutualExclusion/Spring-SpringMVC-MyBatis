package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class Operator {
	/**
	 * 返回总页数
	 *
	 * @param total
	 *            获得的关键集的总数
	 * @param rowcount
	 *            设置当前页面显示行数
	 */
	public static int getTotalPage(int total, int rowcount) {
		if (total % rowcount == 0) {
			total = total / rowcount;
		} else {
			total = total / rowcount + 1;
		}
		return total;
	}

	/**
	 * 目的返回真确的页数，防止输入请求页码错误
	 *
	 * @author NullPointer
	 * @param page
	 *            求情页
	 * @param total
	 *            总页数
	 * @return 正确页
	 */
	public static int setCurrPage(int page, int total) {
		if (page >= total) {
			return total - 1;
		} else if (page < 0) {
			return 0;
		}
		return page;
	}

	/**
	 * 从前端页面通过Ajax技术传回的图片将保存在服务器的临时文件夹中
	 *
	 * @param pics 图片文件
	 * @param request
	 * @return "当前页面"
	 */
	@RequestMapping(value = "/upload/uploadPics.do")
	@ResponseBody
	public Map<String, Object> uploadPics(MultipartFile pics, HttpServletRequest request) {
		// 上传文件路径
		String Path = request.getServletContext().getRealPath("/temp/");
		System.out.println("文件上传路径:" + Path);
		// 上传文件名
		String SourceFileName = pics.getOriginalFilename();
		String fileName = UUID.randomUUID().toString() + SourceFileName.substring(SourceFileName.lastIndexOf("."), SourceFileName.length());
		System.out.println("文件名:" + fileName);
		File filePath = new File(Path, fileName);
		if (!filePath.getParentFile().exists()) {
			filePath.mkdirs();
		}
		try {
			pics.transferTo(new File(Path + File.separator + fileName));
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("fileName", "temp/" + fileName);
		System.out.println("已经到达了！");
		return map;
	}
	@RequestMapping(value="/login_in.do")
	public String loginIn(Map<String ,Object> map){
		return "console/index";
	}
}