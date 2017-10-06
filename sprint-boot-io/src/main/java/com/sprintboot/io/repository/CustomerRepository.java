package com.sprintboot.io.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sprintboot.io.pojo.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
