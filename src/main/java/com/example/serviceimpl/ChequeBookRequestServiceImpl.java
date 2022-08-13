package com.example.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ChequeBookRequest;
import com.example.model.LostStolen;
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

	@Override
	public Object getChequeBookRequest(int id) {
		ChequeBookRequest e = chequeBookRequestRepo.findById(id).orElse(null);
		Map<String, Object> map = new HashMap<>();
		
		if(e!=null) {
			System.out.println("Inside function");
			System.out.println(e.getAccount().getAccount_no());
			System.out.println(e.getAccount().getCreditDebitCard());
			map.put("account_number",e.getAccount().getAccount_no());
			map.put("account_type", e.getAccount().getAccount_type());
			map.put("customer_name",e.getAccount().getCustomer().getCustomer_name());
			map.put("request_date",e.getRequest_date());
			map.put("no_of_leaves",e.getNo_of_leaves());		
		}
		return map;
	}

}
