package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
	
	@Bean("firstAnimalName")
	public String getAnimalName() {
		return "Fluffy";
	}
	@Bean("secondAnimalName")
	public String getSecondAnimalName() {
		return "Rango";
	}

}
