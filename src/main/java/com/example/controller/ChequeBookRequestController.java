package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ChequeBookRequest;
import com.example.service.ChequeBookRequestService;

@RestController
public class ChequeBookRequestController {

	@Autowired
	private ChequeBookRequestService chequeBookRequestService;

	@RequestMapping(value="/updateCheckBookServiceInfo",method=RequestMethod.PUT)
	public Object updateEmp(@RequestBody ChequeBookRequest a) {
	        return chequeBookRequestService.updateChequeBookRequest(a);

	    }
}
