package com.stefanwebdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AspectsApplication {

	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication();
		ApplicationContext applicationContext = SpringApplication.run(AspectsApplication.class, args);
	}
}
