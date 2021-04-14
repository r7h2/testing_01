package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Employee;

@RestController
@RequestMapping("/info")
public class EmployeeController {

	@GetMapping("/employees")
	public String getEmployees() {
		
		return "All Employees";
	}
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee emp) {
		emp.setAge(100);
		return emp;
	}
	@GetMapping(value = "/employees/{empName}", produces = "application/json")
	public Employee getEmployee(@PathVariable  String empName) {
		Employee emp = new Employee();
		emp.setName(empName);
		emp.setAge(43);
		return emp;
	}
	@RequestMapping(value = "/testing/{id}/blah", method = {RequestMethod.GET, RequestMethod.POST})
	public String tryParams(@PathVariable int id, @RequestParam String name) {
		
		return "id: " + id + " name: " + name;
	}
	@RequestMapping(value = "/submit", method = {RequestMethod.POST})
	public String showSubmittedPost(@RequestParam int age) {
		return "Age submitted was this: " + age;
	}
	
}
