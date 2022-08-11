package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.AddOnCard;
import com.example.model.ChequeBookRequest;
import com.example.model.CustomerRequestList;
import com.example.model.IncreaseCreditLimit;
import com.example.model.LostStolen;
import com.example.repository.RequestRepo;
import com.example.service.CustomerRequestService;

public class CustomerRequestServiceImpl implements CustomerRequestService{
	
	@Autowired
	private RequestRepo requestRepo;

	@Override
	public Object getRequestByType(String type, String status) {
		// TODO Auto-generated method stub
		
		List<Map<String, Object>> list = new ArrayList<>();
		
		List<CustomerRequestList> requests = requestRepo.findAllByType(type);
		
		
		String rqType;
		
		for(CustomerRequestList rq: requests) {
			
			Map<String, Object> map = new HashMap<>();
			rqType = rq.getRequest_type();
			
			if(rqType=="") 
			{
				//request type 1
				
				AddOnCard a = requestRepo.findAddOnCardRequestById(rq.getRequest_id(), status);
				map.put("Account Number",a.getAccount().getAccount_no());
			}
			else if(rqType=="") 
			{
				//request type 2
				IncreaseCreditLimit a = requestRepo.findCreditLimitRequestById(rq.getRequest_id(), status);
				map.put("Account Number",a.getAccount().getAccount_no());
			
			}
			else if(rqType=="") 
			{
				//request type 3
				LostStolen a = requestRepo.findLostStolenRequestById(rq.getRequest_id(), status);
				map.put("Account Number",a.getAccount().getAccount_no());
			
			}
			else if(rqType=="") 
			{
				//request type 4
				ChequeBookRequest a = requestRepo.findChequeBookRequestById(rq.getRequest_id(), status);
				map.put("Account Number",a.getAccount().getAccount_no());
			
			}
			
			map.put("Request Type", type);
			
			
			
			
		}
		
		return list;
	}

}
