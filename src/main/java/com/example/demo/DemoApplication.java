package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Hello Akash");
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){

		return args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot:");
		};
	}*/
}
