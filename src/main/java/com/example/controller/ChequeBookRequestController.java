package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/updateCheckBookServiceInfo",method=RequestMethod.PUT)
	public Object updateEmp(@RequestBody ChequeBookRequest a) {
	        return chequeBookRequestService.updateChequeBookRequest(a);

	    }
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/getChequeBookRequest/{id}", method=RequestMethod.GET)
	public Object getEmpById(@PathVariable int id) {
		return(chequeBookRequestService.getChequeBookRequest(id));
 }
}
