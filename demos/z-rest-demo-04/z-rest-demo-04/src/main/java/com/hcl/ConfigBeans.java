package com.hcl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {
	
	@Bean("name01")
	public String getName() {
		return "Fluffy";
	}

}
