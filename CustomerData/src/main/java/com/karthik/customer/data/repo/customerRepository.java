package com.karthik.customer.data.repo;

import org.springframework.data.repository.CrudRepository;

import com.karthik.customer.data.entities.Customer;

public interface customerRepository extends CrudRepository<Customer, Long> {

}
