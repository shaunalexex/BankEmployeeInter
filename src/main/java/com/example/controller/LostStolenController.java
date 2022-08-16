package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.LostStolen;
import com.example.service.LostStolenService;

@RestController
public class LostStolenController {
			
	@Autowired
	private LostStolenService lostStolenService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/updateLostStolenInfo",method=RequestMethod.PUT)
	public Object updateEmp(@RequestBody LostStolen a) {

	        return lostStolenService.updateLostStolen(a);

	    }
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/getStolenCardInfo/{id}", method=RequestMethod.GET)
	public Object getEmpById(@PathVariable int id) {
		return(lostStolenService.getLostSolenById(id));
	}
	
	
}
