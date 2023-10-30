package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.springboot.demo.controller.EmployeeController;

@SpringBootApplication
@Import(DBConfig.class)
@ComponentScan("com.springboot.demo")
public class SpringbootSourcetreeExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootSourcetreeExampleApplication.class, args);
		EmployeeController controller = (EmployeeController) context.getBean(EmployeeController.class);
		controller.addEmployee();
	}

}
