package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.AddOnCard;
import com.example.model.ChequeBookRequest;
import com.example.model.CustomerRequestList;
import com.example.model.LostStolen;
import com.example.repository.RequestRepo;
import com.example.service.CustomerRequestService;

@Service
public class CustomerRequestServiceImpl implements CustomerRequestService{
	
	@Autowired
	private RequestRepo requestRepo;

	@Override
	public Object getRequestByType(String type, String status) {
		// TODO Auto-generated method stub
		
		List<Map<String,Object>> list = new ArrayList<>();
		
		List<Object[]> requests = new ArrayList<>();
		
		if(type=="") {
			List<CustomerRequestList> requestList = requestRepo.findAll();
			
			for(CustomerRequestList request: requestList) {
				
				
			
				for(AddOnCard a: request.getAddOnCards()) {
					
					if(a.getStatus().equals(status)==false && status!="") {
						
						System.out.println("here "+a.getStatus()+"---"+status);
						continue;
					}
					
					Map<String, Object> map = new HashMap<>();
					map.put("request_id", a.getAddon_card_request_id());
					map.put("request_type", request.getRequest_type());
					map.put("account_no", a.getAccount().getAccount_no());
					map.put("customer_name", a.getAccount().getCustomer().getCustomer_name());
					map.put("request_date", a.getRequest_date());
					map.put("status", a.getStatus());
					
					list.add(map);
				}
				for(LostStolen a: request.getLostStolen()) {
					
					if(a.getStatus().equals(status)==false && status!="") {
						
						System.out.println("here "+a.getStatus()+"---"+status);
						continue;
					}
					
					Map<String, Object> map = new HashMap<>();
					map.put("request_id", a.getLstRequestId());
					map.put("request_type", request.getRequest_type());
					map.put("account_no", a.getAccount().getAccount_no());
					map.put("customer_name", a.getAccount().getCustomer().getCustomer_name());
					map.put("request_date", a.getRequestDate());
					map.put("status", a.getStatus());
					
					list.add(map);
				}
				for(ChequeBookRequest a: request.getChequeBookRequest()) {
					
					if(a.getStatus().equals(status)==false && status!="") {
						
						System.out.println("here "+a.getStatus()+"---"+status);
						continue;
					}
					
					Map<String, Object> map = new HashMap<>();
					map.put("request_id", a.getChequebook_id());
					map.put("request_type", request.getRequest_type());
					map.put("account_no", a.getAccount().getAccount_no());
					map.put("customer_name", a.getAccount().getCustomer().getCustomer_name());
					map.put("request_date", a.getRequest_date());
					map.put("status", a.getStatus());
					
					list.add(map);
				}
			}
			
			return list;
		}
		
		switch(type) {
		
			case "":break;
		
			case "lost_stolen": 
				requests = requestRepo.findAllByStatuslst(status);
				break;
			case "add_on_card": 
				requests = requestRepo.findAllByStatusaoc(status);
				break;
			case "cheque_book_request": 
				requests = requestRepo.findAllByStatuscbr(status);
				break;
			case "credit_limit": 
				requests = requestRepo.findAllByStatuscl(status);
				break;
		
		
		}
		
		for(Object[] rq: requests) {
			
			Map<String, Object> map = new HashMap<>();
			map.put("request_id", rq[0]);
			map.put("request_type", rq[1]);
			map.put("account_no", rq[3]);
			map.put("customer_name", rq[4]);
			map.put("request_date", rq[5]);
			map.put("status", rq[6]);
			
			list.add(map);

		}
		
		
		return list;
	}

}
