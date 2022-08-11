package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CustomerRequestList;
import com.example.service.CustomerRequestService;

@RestController
public class CustomerRequestController {
	
	@Autowired
	private CustomerRequestService requestService;
	
	
}
