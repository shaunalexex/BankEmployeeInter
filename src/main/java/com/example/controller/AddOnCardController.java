package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AddOnCard;
import com.example.service.AddOnCardService;


@RestController
public class AddOnCardController {
	
	@Autowired
	private AddOnCardService addOnCardService;

	@RequestMapping(value="/updateCardInfo",method=RequestMethod.PUT)
	public Object updateEmp(@RequestBody AddOnCard a) {

	        return addOnCardService.updateCard(a);

	    }
}
