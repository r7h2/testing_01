package com.hcl.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.User;
import com.hcl.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService users;
	
	@GetMapping("/users")
	public ResponseEntity<String> displayAllUsers(@RequestParam(value = "groupName", 
	defaultValue = "ABC") String groupName) {
		//return ResponseEntity.ok(userList.findAll());
		//return new ResponseEntity<>(userList.findAll(), HttpStatus.BAD_REQUEST);
		return ResponseEntity.ok("group name = " + groupName);
				
	}
	@PostMapping("/users")
	public User saveUser(@RequestParam String id) {
		User newUser = new User(id, "Rick", 27);
		return users.save(newUser);
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId) {
		return users.findById(userId);
	}
	
	
	@GetMapping("/users/{userId}/{name}")
	public String getUserName(@PathVariable String userId, @PathVariable (value = "name") String userName) {
		return "userId=" + userId + " and userName=" + userName;
	}

}
