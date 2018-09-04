package com.project.EncryptPasswordFront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project.controller")
public class EncryptPasswordFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncryptPasswordFrontApplication.class, args);
	}
}
