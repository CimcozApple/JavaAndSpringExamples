package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
@Author Varun Adhikari
*/
@SpringBootApplication
@EnableJpaRepositories
public class UserApplicationServer {
	public static void main(String[] args) {
		SpringApplication.run(UserApplicationServer.class, args);
	}
}

