package com.capgemini.rest.fisrtrest.employeeResource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.rest.fisrtrest.employee.Employee;
import com.capgemini.rest.fisrtrest.restservices.EmployeeService;

@RestController
@RequestMapping("/employees") // Addressable Resource
public class EmployeeResource {

	@Autowired
	private EmployeeService service;

	@PostMapping // Uniform Constraint Interface
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}

	// @RequestMapping(method = RequestMethod.GET, produces = { "application/json",
	// "application/xml" })

	@GetMapping // Uniform Constraint Interface
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@PutMapping//Uniform Constraint Interface public List<Employee>
	public void updtaeEmployees(@RequestBody Employee employee) {
		 service.updateEmployee(employee);
	}

	@DeleteMapping("/{empId}")//Uniform Constraint Interface public List<Employee>
	public void deleteEmployees(@RequestBody int empId) {
		 service.deleteEmployee(empId);
	}
	
	@GetMapping("/{empId}")//Uniform Constraint Interface public List<Employee>
	public Employee getEmployeeById(@RequestBody int empId) {
		return  service.getEmployeeById(empId);
	}
}