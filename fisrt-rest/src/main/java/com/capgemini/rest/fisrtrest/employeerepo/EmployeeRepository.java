package com.capgemini.rest.fisrtrest.employeerepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.rest.fisrtrest.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}