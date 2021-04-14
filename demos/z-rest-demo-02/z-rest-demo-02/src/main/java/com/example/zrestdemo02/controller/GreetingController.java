package com.example.zrestdemo02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zrestdemo02.Dog;

@RestController
@RequestMapping("/apis")
public class GreetingController {
	
	@GetMapping("/greetings")
	public String getDogs() {
		
		return "Greetings!";
	}
	@GetMapping("/greetings/{greetingId}")
	public Greeting displayGreeting() {
		return new Greeting("hello, there");
	}

}
