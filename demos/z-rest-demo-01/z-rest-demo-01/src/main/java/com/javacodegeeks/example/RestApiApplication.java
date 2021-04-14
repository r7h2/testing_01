package com.javacodegeeks.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javacodegeeks.example.model.Student;
import com.javacodegeeks.example.repository.StudentRepository;

// example found here: https://examples.javacodegeeks.com/enterprise-java/spring/boot/spring-boot-rest-api-tutorial/

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StudentRepository repository) {
		return args -> {
			repository.save(new Student("Jane", "Doe", "Junior"));
			repository.save(new Student("Martin", "Fowler", "Senior"));
			repository.save(new Student("Roy", "Fielding", "Freshman"));
		};
	}
}
