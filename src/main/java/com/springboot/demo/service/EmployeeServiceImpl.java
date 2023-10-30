package com.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.demo.dao.EmployeeDAO;
import com.springboot.demo.model.Employee;


@Component
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void insert(Employee employee) {
		employeeDAO.insert(employee);
	}

}
