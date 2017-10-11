package com.sprintboot.io.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sprintboot.io.pojo.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
	// CrudRepository<Employee, Long> {

}
