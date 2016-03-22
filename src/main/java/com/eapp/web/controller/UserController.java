package com.eapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		System.out.println("执行到了该Controller");
		return "user/helloWorld";
	}
}