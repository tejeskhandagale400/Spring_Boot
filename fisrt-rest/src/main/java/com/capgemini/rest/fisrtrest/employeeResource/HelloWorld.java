package com.capgemini.rest.fisrtrest.employeeResource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/") 
public class HelloWorld {
 
		@RequestMapping()
		public String helloWorld() {
			return "Hello";
		}

		//@RequestMapping(method = Re
}