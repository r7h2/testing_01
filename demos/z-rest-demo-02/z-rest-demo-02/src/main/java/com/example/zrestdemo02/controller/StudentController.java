package com.example.zrestdemo02.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.zrestdemo02.model.Student;
import com.example.zrestdemo02.service.StudentService;

@RestController
public class StudentController {
	
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam(value = "name", defaultValue = "unknown") String name){
		//Student s1 = new Student("Fred", 76);
		Student s1 = new Student(name, 76);
		//studentList.add(new Student(2, "Sally", 28));
		return s1;
	}
	@PostMapping("/student")
	public Student createNewStudent(@RequestBody Student newStudent) {
		return newStudent;
	}
	
	@GetMapping("students/{studentName}")
	public Student getStudentByName (@PathVariable String studentName) {
		return new Student(studentName, 44);
	}
}
