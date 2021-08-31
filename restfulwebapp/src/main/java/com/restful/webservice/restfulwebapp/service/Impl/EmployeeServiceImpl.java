package com.restful.webservice.restfulwebapp.service.Impl;

import org.springframework.stereotype.Service;

import com.restful.webservice.restfulwebapp.model.Employee;
import com.restful.webservice.restfulwebapp.repository.EmployeeRepository;
import com.restful.webservice.restfulwebapp.service.EmployeeService;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		return employeeRepository.findAll();
	}

}
