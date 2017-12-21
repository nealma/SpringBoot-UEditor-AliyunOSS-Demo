package com.nealma.ext.ueditor.demo.ueditordemo;

import com.nealma.ext.ueditor.ActionEnter;
import com.nealma.ext.ueditor.aliyunoss.OSSConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class UEditorController {

	@Resource
	private OSSConfig ossConfig;

	@RequestMapping("/")
	public ModelAndView index(){
		return new ModelAndView("ueditor");
	}

	@RequestMapping("/ueditor/upload")
	public void upload(HttpServletRequest request, HttpServletResponse response)
			throws IOException{
		System.out.println(ossConfig);
		request.setCharacterEncoding("utf-8");
		response.addHeader("Content-Type", "application/x-javascript");
		String res = new ActionEnter(request, ossConfig).exec();
		response.getWriter().write(res);
	}

}
