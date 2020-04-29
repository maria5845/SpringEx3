package com.ja.reference.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test/*")
public class Test1 {
	//   @PostMapping("/test1")
	 
	@GetMapping("/test1")
	   public String test1 () {
		System.out.println("안녕");
    	   return"test1";
    	   
       }
	
	@RequestMapping("/test2")
	public String test2(HttpSession session) {
		session.setAttribute("xxxx", 1111);
		session.getAttribute("xxxx");
		return"test2";
	}
	@RequestMapping("/test3")
	public String test3(Model model) {
		String title = "제목입니다.";
		model.addAttribute("title", title);
		
		return"test1";
		
	}
	
	
	
	
	
	
	
	
	
}
