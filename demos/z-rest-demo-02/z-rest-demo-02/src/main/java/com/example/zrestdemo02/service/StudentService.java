package com.example.zrestdemo02.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.zrestdemo02.model.Student;

@Component
public class StudentService {
	
	Map<Integer, Student> studentMap = new HashMap<>();
	private int count = 0;
	{
		//studentMap.put(count++, new Student(55, "John", 55));
		//studentMap.put(count++, new Student(68, "Sandy",31));
	}
	public Student save(Student s) {
		studentMap.put(count++, s);
		return studentMap.get(count);
	}
	public Collection<Student> findAll(){
		return studentMap.values();
	}

}
