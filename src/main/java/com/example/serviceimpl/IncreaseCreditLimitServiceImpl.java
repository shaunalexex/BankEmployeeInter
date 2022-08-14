package com.example.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.AddOnCard;
import com.example.model.ChequeBookRequest;
import com.example.model.IncreaseCreditLimit;
import com.example.repository.ChequeBookRequestRepo;
import com.example.repository.IncreaseCreditLimitRepo;
import com.example.service.IncreaseCreditLimitService;

@Service
public class IncreaseCreditLimitServiceImpl implements IncreaseCreditLimitService {
	
	@Autowired
	private IncreaseCreditLimitRepo increaseCreditLimitRepo;
		
	@Override
	public Object updateCreditLimit(IncreaseCreditLimit increaseCreditLimit) {
		IncreaseCreditLimit IncreaseCreditLimitObj = increaseCreditLimitRepo.findById(increaseCreditLimit.getCreditlimit_id()).orElse(null);
		Map<String,Object> map=new HashMap<>();
		System.out.println("inside");
		if(IncreaseCreditLimitObj!=null)
		{
			System.out.println(increaseCreditLimit.getStatus());
			IncreaseCreditLimitObj.setStatus(increaseCreditLimit.getStatus());
			IncreaseCreditLimitObj.getAccount().getCreditDebitCard().get(0).setCreditLimit(increaseCreditLimit.getRequest_credit_Limit());
			IncreaseCreditLimitObj.setReason(increaseCreditLimit.getReason());
			increaseCreditLimitRepo.saveAndFlush(IncreaseCreditLimitObj);
			map.put("status", "success");
		}
		
		return map;
	}

	@Override
	public Object getByCreditLimitId(int id) {
			
		IncreaseCreditLimit e = increaseCreditLimitRepo.findById(id).orElse(null);
			
			Map<String, Object> map = new HashMap<>();
			
			if(e!=null) {
				map.put("name", e.getAccount().getCustomer().getCustomer_name());
				map.put("card_type", e.getAccount().getCreditDebitCard().get(0).getCardType());
				map.put("card_number", e.getAccount().getCreditDebitCard().get(0).getCardNumber());
				map.put("max_credit_limit", e.getAccount().getCreditDebitCard().get(0).getMaxCreditLimit());
				map.put("credit_limit", e.getAccount().getCreditDebitCard().get(0).getCreditLimit());
				map.put("requested_credit_limit", e.getRequest_credit_Limit());
				
			}
			return map;
			
	}

}
