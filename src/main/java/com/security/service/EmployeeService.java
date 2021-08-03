package com.security.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.security.model.Employee;

@Service
public class EmployeeService {

	public static Map<Integer, Employee> map;
	
	 @PostConstruct
	 public void doLog() {
	       Employee employee1 = new Employee();
	       employee1.setId(101);employee1.setName("peter");employee1.setAge(30);employee1.setSalary(10000.0);
	       Employee employee2 = new Employee();
	       employee2.setId(102);employee2.setName("scot");employee2.setAge(40); employee2.setSalary(20000.0);
	       map = new HashMap<Integer, Employee>();
	       map.put(employee1.getId(), employee1);
	       map.put(employee2.getId(), employee2);
	}
	
	 
	 
}
