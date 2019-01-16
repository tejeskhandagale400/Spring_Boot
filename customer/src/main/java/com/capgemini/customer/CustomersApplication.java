package com.capgemini.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.customer.customers.Customers;
import com.capgemini.customer.repo.CustomerRepo;

@SpringBootApplication
public class CustomersApplication implements CommandLineRunner{

	@Autowired
	private CustomerRepo repository;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomersApplication.class, args);
	}
	
	

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customers("Alice", "Smith"));
		repository.save(new Customers("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customers customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customers customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}

	}

}