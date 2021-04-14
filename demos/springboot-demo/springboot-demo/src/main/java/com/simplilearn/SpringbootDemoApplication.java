package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.simplilearn.model.User;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
		
		User u1 = new User();
		u1.setName("Fred");
		u1.setAge(68);
		System.out.println("this is from the main method: " + u1);
		
		
	}

}
