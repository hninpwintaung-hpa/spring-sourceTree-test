package com.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.demo.model.Employee;
import com.springboot.demo.service.EmployeeService;



@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;
	private Employee employee;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void addEmployee() {
	    employee = new Employee();
	    employee.setId(2);
	    employee.setName("Ma Hnin Pwint");
	    employee.setEmail("hnin@gmail.com");
	    employee.setPhone("0884224");
	    employee.setAddress("Mawlamyine");
		employeeService.insert(employee);
	}

}
