package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmployeeService;



@RestController
@CrossOrigin
public class EmployeeController {
	
			@Autowired
			private EmployeeService employeeService;
			
			@RequestMapping(value="/getEmpById/{id}",method=RequestMethod.GET)
			public Object getEmpById(@PathVariable int id)
			{
				return(employeeService.getEmployeeById(id));
			}
			
			
}