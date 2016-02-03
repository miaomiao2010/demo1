package com.demo.module.index.control.front;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.context.ContextLoaderListener;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String toIndex(HttpServletRequest request,Model model){
		
		return "index";
	}
}
