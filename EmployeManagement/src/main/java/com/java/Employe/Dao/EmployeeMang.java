package com.java.Employe.Dao;

import org.springframework.data.repository.CrudRepository;

import com.java.Employe.entity.Employee;

public interface EmployeeMang extends CrudRepository<Employee, Integer> {

}
