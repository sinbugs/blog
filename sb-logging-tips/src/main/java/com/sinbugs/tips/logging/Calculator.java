package com.sinbugs.tips.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
	
	private Logger log = LoggerFactory.getLogger(Calculator.class);
	
	private Long a;
	private Long b;
	
	public Calculator(Long a, Long b) {
		this.a = a;
		this.b = b;
	}


	long divide (){
		return this.a/this.b;
	}
	
}
