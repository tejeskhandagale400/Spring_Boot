package com.capgemini.customer.customers;

import org.springframework.data.annotation.Id;

public class Customers {

    @Id
    public String customerId;

    public String firstName;
    public String lastName;

    public Customers() {}

    public Customers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[customerId=%s, firstName='%s', lastName='%s']",
                customerId, firstName, lastName);
    }

}