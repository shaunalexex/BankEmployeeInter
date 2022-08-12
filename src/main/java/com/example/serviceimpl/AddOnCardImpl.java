package com.example.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.AddOnCard;
import com.example.repository.AddOnCardRepo;
import com.example.service.AddOnCardService;


@Service
public class AddOnCardImpl implements AddOnCardService {
	
	@Autowired
	private AddOnCardRepo addOnCardRepo;

	@Override
	public Object updateCard(AddOnCard addCard) {
		// TODO Auto-generated method stub
		AddOnCard addCardObj = addOnCardRepo.findById(addCard.getAddon_card_request_id()).orElse(null);
		Map<String,Object> map=new HashMap<>();
		
		if(addCardObj!=null)
		{
			System.out.println(addCard.getStatus());
			addCardObj.setStatus(addCard.getStatus());
			addCardObj.setReason(addCard.getReason());
			addOnCardRepo.saveAndFlush(addCardObj);
			map.put("status", "success");
		}
				
			
			return map;
		}

	@Override
	public Object getAddOnCardById(int id) {
		// TODO Auto-generated method stub
		
		AddOnCard e = addOnCardRepo.findById(id).orElse(null);
		
		Map<String, Object> map = new HashMap<>();
		
		if(e!=null) {
			map.put("account_no", e.getAccount().getAccount_no());
			map.put("customer_name", e.getAccount().getCustomer().getCustomer_name());
			map.put("request_date", e.getRequest_date());
			
		}
		return map;
		
	}
	}

	

