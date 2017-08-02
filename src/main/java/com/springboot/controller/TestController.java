package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(path="/test")
	public String testMethod1(){
		return "Demo-Spring-Boot-Application";
	}
	
	@RequestMapping(path="/test2")
	public String testMethod2(){
		return "Another Demo-Spring-Boot-Application - 2";
	}
	@RequestMapping(path="/test3")
	public String testMethod3(){
		return "Another Demo-Spring-Boot-Application - 3";
	}
	@RequestMapping(path="/test4")
	public String testMethod4(){
		return "Another Demo-Spring-Boot-Application - 4";
	}
	
	@RequestMapping(path="/test5")
	public String testMethod5(){
		return "Another Demo-Spring-Boot-Application - 5";
	}
	@RequestMapping(path="/test6")
	public String testMethod6(){
		return "Another Demo-Spring-Boot-Application - 5";
	}

}
