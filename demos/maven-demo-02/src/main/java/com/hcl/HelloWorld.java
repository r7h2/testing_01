package com.hcl;

import javax.management.RuntimeErrorException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hcl.logging.Log4j2HelloWorld;

public class HelloWorld {

	private final static Logger logger = LogManager.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		System.out.println("logger printed out is this: "  + logger);
	
		
		if (true) {
			
			logger.error("in if block");
			
			//throw new RuntimeException();
		}
		
		int x = 5;
		System.out.println(x);
		logger.error("in error");
		logger.info("in info");
		logger.debug("in debug logger");

	}

}
