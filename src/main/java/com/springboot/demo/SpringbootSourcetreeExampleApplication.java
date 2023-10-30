package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DBConfig.class)
public class SpringbootSourcetreeExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSourcetreeExampleApplication.class, args);
	}

}
