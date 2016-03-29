package com.eapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "user/helloWorld";
	}
	
	@RequestMapping("/getRequestBody")
	public String getRequestBody(@RequestParam String userId) {
		System.out.println("userId:" + userId);
		return "index";
	}
}
