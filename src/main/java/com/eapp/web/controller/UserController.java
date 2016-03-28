package com.eapp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eapp.web.controller.dto.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "user/helloWorld";
	}
	
	@RequestMapping("/getParam")
	public String getParam(String userId, Double money, double stature) {
		System.out.println("userId:" + userId);
		System.out.println("money:" + money);
		System.out.println("stature:" + stature);
		return "index";
	}
	
	@RequestMapping("/wrapToObjectParam")
	public String wrapToObjectParam(User user, HttpServletRequest request) {
		System.out.println(request.getParameter("userName"));
		System.out.println(user);
		return "index";
	}
}
