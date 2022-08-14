package com.example.service;

import com.example.model.IncreaseCreditLimit;

public interface IncreaseCreditLimitService {
	public Object updateCreditLimit(IncreaseCreditLimit increaseCreditLimit);
	
	public Object getByCreditLimitId(int id);

}
