package com.example.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ChequeBookRequest;
import com.example.repository.ChequeBookRequestRepo;
import com.example.service.ChequeBookRequestService;

@Service
public class ChequeBookRequestServiceImpl implements ChequeBookRequestService {

	@Autowired
	private ChequeBookRequestRepo chequeBookRequestRepo; 
	
	@Override
	public Object updateChequeBookRequest(ChequeBookRequest chequeBookRequest) {
		
		ChequeBookRequest checkBookRequestObj = chequeBookRequestRepo.findById(chequeBookRequest.getChequebook_id()).orElse(null);
		Map<String,Object> map=new HashMap<>();
		System.out.println("inside");
		if(checkBookRequestObj!=null)
		{
			System.out.println(chequeBookRequest.getStatus());
			checkBookRequestObj.setStatus(chequeBookRequest.getStatus());
			checkBookRequestObj.setReason(chequeBookRequest.getReason());
			chequeBookRequestRepo.saveAndFlush(checkBookRequestObj);
			map.put("status", "success");
		}
		
		return map;
	}

}
