package com.springjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springjwt")
public class SecurityjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityjwtApplication.class, args);
	}

}
