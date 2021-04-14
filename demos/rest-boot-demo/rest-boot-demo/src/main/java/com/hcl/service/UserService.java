package com.hcl.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hcl.model.User;

@Component
public class UserService {
	
	//private List<User> listUsers = new ArrayList<>();
	private Map<String, User> users = new HashMap<>();
	
	public UserService() {
		users.put("56", new User("56", "Linda", 33));
	}
	
	public User save(User u) {
		users.put(u.getId(), u);
		return u;
	}
	public User findById(String id) {
		return users.get(id);
	}
	
	public Map<String, User> findAll(){
		return users;
	}

}
