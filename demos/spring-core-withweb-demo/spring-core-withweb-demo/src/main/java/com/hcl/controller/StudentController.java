package com.hcl.controller;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

	@RequestMapping(value="/student", method = {RequestMethod.GET, RequestMethod.POST}, produces = {"application/json"})
	public Student getStudent() {
		Student s1 = new Student();
		s1.setAge(16);
		s1.setName("Fred");
		return s1;
	}
	@GetMapping(value="/course", produces = {"application/json"})
	public Student getStudentCourse() {
		Student s2 = new Student();
		s2.setAge(55);
		s2.setName("sally");
		return s2;
	}
}
