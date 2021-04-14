package com.hcl.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2HelloWorld {
	
	// official log4j2 documentation: https://logging.apache.org/log4j/log4j-2.4/manual/configuration.html
	
	private final static Logger logger = LogManager.getLogger(Log4j2HelloWorld.class);
	
	public static final void main (String[] args) {
		
		logger.trace ("trace message");
		logger.debug("debug message");
		logger.info("info message");
		logger.error("error message");
		logger.warn("you are in warning");
	}

	
}
