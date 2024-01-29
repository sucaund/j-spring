package com.example.oBootHello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	private static final Logger loggger = LoggerFactory.getLogger(HelloController.class);
	

	// prefix -> templates
	// suffix -> .html
	@RequestMapping("hello")
	public String helloua(Model model) {
		System.out.println("hello start....");
		loggger.info("start...!");  //System.out.println; 보다 본인 소속 컨트롤러등 소속을 표시하기에 후에 수정하거나 이상이있을떄 확인이 빠르다!
		model.addAttribute("parameter","boot start...");
		return "hello";
		
	}
	@ResponseBody
	@GetMapping("ajaxString")
	//Request parameter 필수
	public String ajaxString(@RequestParam("ajaxName") String aName) {
		System.out.println("HelloController ajaxString aName->"+ aName);
		return aName;
		
	}
	
}
