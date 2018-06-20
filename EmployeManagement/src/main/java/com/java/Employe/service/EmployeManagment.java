package com.java.Employe.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Employe.Dao.EmployeeMang;
import com.java.Employe.entity.Employee;

@Service
public class EmployeManagment {
	@Autowired
	private EmployeeMang employeeMang;

	public Employee Create(Employee employee) {
		
		return employeeMang.save(employee);
		
	}

	public Iterable<Employee> getAll(Employee employee) {
		
		return employeeMang.findAll();
	}

	public Optional<Employee> getById(Integer id) {
		
		return employeeMang.findById(id);
	}

}
