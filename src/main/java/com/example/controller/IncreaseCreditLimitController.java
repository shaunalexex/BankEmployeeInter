package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.IncreaseCreditLimit;
import com.example.service.IncreaseCreditLimitService;

@RestController
public class IncreaseCreditLimitController {
	
	@Autowired
	private IncreaseCreditLimitService increaseCreditLimitService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/updateCreditLimit",method=RequestMethod.PUT)
	public Object updateEmp(@RequestBody IncreaseCreditLimit a) {
	        return increaseCreditLimitService.updateCreditLimit(a);

	    }
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/getIncreaseCreditLimit/{id}", method=RequestMethod.GET)
	public Object getEmpById(@PathVariable int id) {
		return(increaseCreditLimitService.getByCreditLimitId(id));
	}

}
