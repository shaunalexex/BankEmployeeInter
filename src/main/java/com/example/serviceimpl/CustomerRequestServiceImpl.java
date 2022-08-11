package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
		
		List<Object[]> requests = requestRepo.findAllByStatus(status);
		
		for(Object[] rq: requests) {
			
			Map<String, Object> map = new HashMap<>();
			map.put("lst_request_id", rq[0]);
			map.put("request_type", rq[1]);
			map.put("request_id",rq[2]);
			map.put("account_no", rq[3]);
			map.put("customer_name", rq[4]);
			map.put("request_date", rq[5]);
			map.put("status", rq[6]);
			
			list.add(map);

		}
		
		
		return list;
	}

}
