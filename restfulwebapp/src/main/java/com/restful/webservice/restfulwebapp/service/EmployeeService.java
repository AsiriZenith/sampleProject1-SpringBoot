package com.restful.webservice.restfulwebapp.service;

import com.restful.webservice.restfulwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployeeDetails();
	Employee getEmployeeById(long id);
	Employee updateEmployee(Employee employee,long id);
	void deleteEmployee(long id);
}
