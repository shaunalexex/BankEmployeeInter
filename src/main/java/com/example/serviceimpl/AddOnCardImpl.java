package com.example.serviceimpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.AddOnCard;
import com.example.repository.AddOnCardRepo;
import com.example.service.AddOnCardService;

@Service
public class AddOnCardImpl implements AddOnCardService {

	private AddOnCardRepo addOnCardRepo;
	
	@Transactional
	@Override
	public Object saveCard(AddOnCard addCard) {
		// TODO Auto-generated method stub
			Map<String, String> map = new HashMap<>();
			
				addOnCardRepo.save(addCard);
				map.put("status", "success");
				map.put("msg", "Data Saved");
			
			return map;
		}
	
}
