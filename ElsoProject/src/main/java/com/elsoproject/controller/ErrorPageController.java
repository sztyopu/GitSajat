package com.elsoproject.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

@Controller
public class ErrorPageController implements ErrorController{
	
	private static final String ERR_PATH = "/error";
	
	private ErrorAttributes errorAttributes;
	
	@Autowired
	public void setErrorAttributes(ErrorAttributes errorAttributes){
		this.errorAttributes = errorAttributes;
	}
	
	@RequestMapping(ERR_PATH)
	public String error(Model model, HttpServletRequest request) {
		ServletWebRequest rA = new ServletWebRequest(request);
		
		Map<String,Object> error = this.errorAttributes.getErrorAttributes(rA, true);
		
		model.addAttribute("timestamp",error.get("timestamp"));
		model.addAttribute("error",error.get("error"));
		model.addAttribute("message",error.get("message"));
		model.addAttribute("path",error.get("path"));
		model.addAttribute("status",error.get("status"));
		
		
		return "detailedError";
	}

	@Override
	public String getErrorPath() {
	return ERR_PATH;
	} 

}
