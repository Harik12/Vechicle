package com.java.Employe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.Employe.entity.Employee;
import com.java.Employe.service.EmployeManagment;

@SpringBootApplication
public class TicketManagements1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(TicketManagements1Application.class, args);
		
		EmployeManagment employeManagment=ctx.getBean("employeManagment", EmployeManagment.class);
		
		Employee employee= new Employee("hari", "hari@gmail.com", "hyd");
		Employee employee1= new Employee("harikr", "hari@gmail.com", "pune");
		
		employeManagment.Create(employee);
		employeManagment.Create(employee1);
		
	}
}
