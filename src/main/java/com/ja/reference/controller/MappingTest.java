package com.ja.reference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MappingTest {

	@RequestMapping("/test1")
	public void test1() {
		// return 타입이 void인 경유는 jsp를 찾는다.
		System.out.println("안녕1");
	}

	@RequestMapping("/test2")
	public String test2() {
		// return 타입이 void인 경유는 jsp를 찾는다.
		System.out.println("안녕2");
		return "test1";
	}

	@RequestMapping("/test3")
	public String test3() {
		System.out.println("안녕3");
		return "redirect:./test2";
	}
	@RequestMapping("/test4")
	public String test4() {
		System.out.println("안녕4");
		return "test1";
	}
}
