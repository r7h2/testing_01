package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Greeting;

@RestController
public class GreetingController {
	
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		return new Greeting(1, name);
	}
	@GetMapping("/greeting/{name}")

	public Greeting greetName(@PathVariable(value = "name") String myName) {
		return new Greeting(2, myName);
		
	}
	
	  @GetMapping("/greeting/{id}/{name}") public Greeting
	  greetIdName(@PathVariable long id, @PathVariable String name) {
	  
	  // this works because of the Jackson library added automatically by boot //
	  //Jackson library converts Java -> JSON 
		  return new Greeting(id, name);
	  
	  }
	 
}
