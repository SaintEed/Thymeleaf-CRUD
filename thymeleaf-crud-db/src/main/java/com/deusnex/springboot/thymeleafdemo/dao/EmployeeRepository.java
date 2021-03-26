package com.deusnex.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deusnex.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//That's it....no code required
	
	// add a method to sort by last name
	
	public List<Employee> findAllByOrderByLastNameAsc();
}
