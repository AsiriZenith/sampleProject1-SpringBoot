package com.restful.webservice.restfulwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restful.webservice.restfulwebapp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
