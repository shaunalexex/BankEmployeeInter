package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.QueryRequest;
import com.example.service.QueryRequestService;

@RestController
public class QueryRequestController {

	@Autowired
	private QueryRequestService queryRequestService;
	
	@RequestMapping(value="/getQueries", method=RequestMethod.GET)
	public Object getQueries() {
		
		//System.out.println(userMap.toString());
		
		return(queryRequestService.getAllQueries());
		
	}
	
	@RequestMapping(value = "/getQueries/{status}", method = RequestMethod.GET)
	public Object getQueryByStatus(@PathVariable String status)
	{
		return queryRequestService.getQueryByStatus(status);
		
	}
	
	@RequestMapping(value = "/updateQuery", method = RequestMethod.PUT)
	public Object updateQueryByStatus(@RequestBody QueryRequest qr)
	{
		return queryRequestService.updateQuery(qr);
		
	}
	@RequestMapping(value = "/getQuery/{id}", method = RequestMethod.GET)
	public Object getQueryById(@PathVariable int id)
	{
		return queryRequestService.getQueryById(id);
		
	}
	
}
