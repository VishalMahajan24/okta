package com.demo.okta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@RequestMapping("/hello")
	
	public String hey (){
		return "Love You Piyu";
	}

}
