package com.springboot.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springboot.demo.model.Employee;


@Component
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public EmployeeDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Employee employee) {
		String sql = "INSERT INTO employees (id, name, email, phone, address) VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getEmail(), employee.getPhone(),
				employee.getAddress());

	}

}
