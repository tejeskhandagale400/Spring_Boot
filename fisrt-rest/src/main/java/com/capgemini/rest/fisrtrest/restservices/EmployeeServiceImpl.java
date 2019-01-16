package com.capgemini.rest.fisrtrest.restservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.rest.fisrtrest.employee.Employee;
import com.capgemini.rest.fisrtrest.employeerepo.EmployeeRepository;

 
@Service
public class EmployeeServiceImpl implements EmployeeService {

	 @Autowired
	 private EmployeeRepository employeeRepository;
	 
	@Override
	public List<Employee> getAllEmployees() {

		return  employeeRepository.findAll();
	}

	 
	@Override
	public void addNewEmployee(Employee employee) {
		employeeRepository.save(employee);
	}


	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}


	@Override
	public void deleteEmployee(int empId) {
		Employee employee = employeeRepository.getOne(empId);
		employeeRepository.delete(employee);
	}


	public Employee getEmployeeById(int empId) {
		Employee employee = employeeRepository.findById(empId).get();
		return employee;
 		 
	}

}
