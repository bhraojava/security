package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Employee;
import com.security.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		if(employeeService.map.get(employee.getId()) != null) {
			throw new RuntimeException("user exits");
		}
		employeeService.map.put(employee.getId(), employee);
		return employeeService.map.get(employee.getId());
 	
	} 
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable String employeeId) {
		
		
	
	}
	
	@GetMapping("/get/{id}")
	public Employee employeeById(@PathVariable String employeeId) {
		if(employeeService.map.get(Integer.valueOf(employeeId)) == null) {
			throw new RuntimeException("Np Employee Found");
		}
		return employeeService.map.get(Integer.valueOf(employeeId));
	}
	
	
	
	
	
}
