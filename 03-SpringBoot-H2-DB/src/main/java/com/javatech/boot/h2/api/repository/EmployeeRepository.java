package com.javatech.boot.h2.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatech.boot.h2.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByDept(String dept);

}
