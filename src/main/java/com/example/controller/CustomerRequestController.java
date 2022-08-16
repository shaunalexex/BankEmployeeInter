package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.CustomerRequestService;

@RestController
public class CustomerRequestController {
	
	@Autowired
	private CustomerRequestService requestService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/getEmpInfo/{type}/{status}", method=RequestMethod.GET)
	public Object getEmpDetails(@PathVariable String type, @PathVariable String status) {
		
		System.out.println(type+"---"+status);
		return(requestService.getRequestByType(type, status));
		
	}
	
	
}
