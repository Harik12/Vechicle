package com.hari.springframework.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Student {
	@RequestMapping(value="/")
	public String get() {
		
		return "this is from hari";
		
	}

}
