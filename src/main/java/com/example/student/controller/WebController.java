package com.example.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public String health() {
		return "Hello World!";
	}
}
