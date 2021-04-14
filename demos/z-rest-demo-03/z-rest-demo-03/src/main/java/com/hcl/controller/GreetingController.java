package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class GreetingController {
	
	@GetMapping("/greeting")
	public String displayGreeting(@RequestParam (value = "name", defaultValue = "unknown") String name) {
		
		return "greetings, " + name;
	}
	
	@GetMapping("/greeting/{greetingMessage}")
	public String displayGreetingId(@PathVariable String greetingMessage) {
		return greetingMessage;
	}

}
