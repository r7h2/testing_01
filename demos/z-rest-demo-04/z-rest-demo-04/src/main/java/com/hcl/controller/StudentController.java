package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Student;

@RestController // this will serve back raw data to client (json, xml, )
@RequestMapping("/api")
public class StudentController {
	
	@GetMapping("/greeting")
	public String generateGreeting() {
		return "greetings!!!!";
	}
	
	@GetMapping("booleantesting")
	public boolean getBool() {
		return true;
	}
	
	@GetMapping(value = "/students/{name}", produces = "application/xml")
	public Student getStudent( @PathVariable  String name) {
		
		Student s = new Student();
		s.setName(name);
		s.setAge(44);
		return s;
		
	}
	@PostMapping(value = "/random", produces = "application/json")
	public Student getPostStudent(  @RequestBody Student student1) {
		student1.setAge(100);
		return student1;
	}
	@GetMapping("/blah")
	public String getPath(@RequestParam String id) {
		
		return "the id = " + id;
	}
	

}
