package com.project.EncryptPassword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.project.bean")
@EnableJpaRepositories("com.project.repo")
@ComponentScan("com.project")
public class EncryptPasswordApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncryptPasswordApplication.class, args);
	}
}
