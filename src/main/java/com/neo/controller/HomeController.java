package com.neo.controller;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home")
public class HomeController {	
	
	@RequestMapping
	public ModelAndView handleRequestInternal(@RequestParam("var") String var,
			HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println(var);
		System.out.println(URLDecoder.decode("aaaa"));
		ModelAndView mav=new ModelAndView("home");
		mav.addObject("msg", var);
		return mav;
			
	}
	

}
