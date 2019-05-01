package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
	public JdbcConnection() {
		System.out.println("JDBC Connection");
		
	}
}
