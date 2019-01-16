package com.capgemini.customer.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.customer.customers.Customers;

public interface CustomerRepo extends MongoRepository<Customers, String> {

	 public Customers findByFirstName(String string);

	 public List<Customers> findByLastName(String string);
	 

	
 }
