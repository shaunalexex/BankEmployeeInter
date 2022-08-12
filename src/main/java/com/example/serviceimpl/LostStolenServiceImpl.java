package com.example.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
			map.put("status", "success");
		}
		
		return map;
	}
}
