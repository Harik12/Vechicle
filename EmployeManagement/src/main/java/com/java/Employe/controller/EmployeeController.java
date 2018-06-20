package com.java.Employe.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.Employe.entity.Employee;
import com.java.Employe.service.EmployeManagment;




@RestController
public class EmployeeController {
@Autowired
private EmployeManagment employeManagment;
	
@RequestMapping(value="/create",method=RequestMethod.POST)
public Employee Create( @RequestBody(required=true) Employee employee) {
	
	return employeManagment.Create(employee);
	
	
}
@GetMapping(value="/getall")
Iterable<Employee> getAll(Employee employee){
	
	return employeManagment.getAll(employee);
	
}

@GetMapping(value="/get/{id}")
public Optional<Employee> getById(@PathVariable("id") Integer id) {
	return employeManagment.getById(id);
}
	

}
