package com.example.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.AddOnCard;
import com.example.model.ChequeBookRequest;
import com.example.model.LostStolen;
import com.example.repository.LostStolenRepo;
import com.example.service.LostStolenService;

@Service
public class LostStolenServiceImpl implements LostStolenService {

	@Autowired
	private LostStolenRepo lostStolenRepo;

	@Override
	public Object updateLostStolen(LostStolen lostStolen) {
		LostStolen LostStolenObj = lostStolenRepo.findById(lostStolen.getLstRequestId()).orElse(null);
		Map<String,Object> map=new HashMap<>();
		System.out.println("inside");
		if(LostStolenObj!=null)
		{
			System.out.println(lostStolen.getStatus());
			LostStolenObj.setStatus(lostStolen.getStatus());
			LostStolenObj.setReason(lostStolen.getReason());
			lostStolenRepo.saveAndFlush(LostStolenObj);
			System.out.println("Hello");
			map.put("status", "success");
		}
		
		return map;
	}

	@Override
	public Object getLostSolenById(int id) {
		LostStolen e = lostStolenRepo.findById(id).orElse(null);
		Map<String, Object> map = new HashMap<>();
		
		if(e!=null) {
			System.out.println("Inside function");
			System.out.println(e.getAccount().getAccount_no());
			System.out.println(e.getAccount().getCreditDebitCard());
			map.put("card_number",e.getAccount().getCreditDebitCard().get(0).getCardNumber());
			map.put("card_type", e.getAccount().getCreditDebitCard().get(0).getCardType());
		}
		return map;
	}
}
