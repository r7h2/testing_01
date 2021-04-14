package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.User;

@RestController
public class DemoController {
	
	@GetMapping("/greeting")
	public String displayHello() {
		return "Hello!!!";
	}
	@GetMapping("/bye")
	public String displayGoodBye() {
		return "See ya!!!";
	}
	
	@GetMapping("/displayUser")
	public String getUserInfo() {
		User u = new User();
		u.setAge(44);
		u.setName("Jane");
	
		return u.toString() ;
	}


}
