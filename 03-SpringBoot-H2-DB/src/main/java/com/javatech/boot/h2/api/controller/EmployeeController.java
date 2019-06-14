package com.javatech.boot.h2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatech.boot.h2.api.model.Employee;
import com.javatech.boot.h2.api.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepository;

	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee employee) {
		empRepository.save(employee);
		return "Employee Saved";
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getEmployee(){
		return empRepository.findAll();
	}
	
	@GetMapping("/getEmployee/{dept}")
	public List<Employee> getEmployeeByDept(@PathVariable String dept){
		return empRepository.findByDept(dept);
		
	}
}
