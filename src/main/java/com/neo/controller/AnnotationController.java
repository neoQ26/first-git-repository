package com.neo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neo.domain.User;


@RequestMapping("/springmvc")
@Controller
public class AnnotationController {

	@InitBinder("user")
	public void a(WebDataBinder  binder){
		binder.setFieldDefaultPrefix("c_");
		System.out.println("---a------"+binder);
	}
	
	@InitBinder("binder")
	public void b(DataBinder binder){
		System.out.println("---b----"+binder);
	}
	
	@ModelAttribute("user")
	public void modelAttr1(Map map){
		System.out.println(map.containsKey("user"));
		map.put("abc","111");
		System.out.println("------1----");
	}
	@ModelAttribute("user")
	public void modelAttr2(Map map,@ModelAttribute("user")User user){
		System.out.println(map.containsKey("abc"));
		System.out.println("------2----");
	}
	
	@RequestMapping(value="/ahome")
	public String sayHi(@ModelAttribute("user") User user,BindingResult result,String id,Map map){
		Set<String> set=map.keySet();
		
		System.out.println(map.containsKey("user1"));
		System.out.println(id);
		return "home";
	}
	@RequestMapping(value="/home")
	@ResponseBody
	public String sayHello(){
		return "home";
	}
	
	@RequestMapping(value="/bhome")
	@ResponseBody
	public Map<String, Object> sayHello2(Model model){
		return new HashMap<String, Object>();
	}
}
