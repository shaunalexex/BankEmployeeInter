package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.QueryRequest;
import com.example.repository.QueryRequestRepo;
import com.example.service.QueryRequestService;




@Service
public class QueryRequestServiceImpl implements QueryRequestService{
	
	@Autowired
    private QueryRequestRepo queryRequestRepo;
	
	
	public Object getAllQueries() {
		System.out.println("Inside");
        List<Map<String,Object>> list=new ArrayList<>();
        List<QueryRequest> qrs=queryRequestRepo.findAll();
        for(QueryRequest qr:qrs) {
            Map<String,Object> map=new HashMap<>();
            System.out.println("Inside");
            map.put("query_id", qr.getQueryid());
            map.put("query", qr.getQuery());
            map.put("requestDate", qr.getRequestDate());
            map.put("queryResponse", qr.getQueryResponse());
            map.put("queryResponseDate", qr.getQueryResponseDate());
            map.put("status", qr.getStatus());
            map.put("account_no", qr.getAccount().getAccount_no());
            System.out.println("Map");
            list.add(map);
        }
        return list;
    }
	
	public Object getQueryByStatus(String status) {
		System.out.println("status");
		List<Map<String, Object>> list = new ArrayList<>();
		List<QueryRequest> qrs = queryRequestRepo.findQueriesByStatus(status);
		for(QueryRequest qr : qrs)
		{
			Map<String,Object> map=new HashMap<>();
            System.out.println("Inside");
            map.put("query_id", qr.getQueryid());
            map.put("query", qr.getQuery());
            map.put("requestDate", qr.getRequestDate());
            map.put("queryResponse", qr.getQueryResponse());
            map.put("queryResponseDate", qr.getQueryResponseDate());
            map.put("status", qr.getStatus());
            map.put("account_no", qr.getAccount().getAccount_no());
            System.out.println("Map");
            list.add(map);
		}
		return list;
	}
	
	public Object getQueryById(int id)
	{
		List<Map<String, Object>> list = new ArrayList<>();
		QueryRequest qr = queryRequestRepo.findById(id).orElse(null);
		Map<String,Object> map=new HashMap<>();
		if(qr != null)
		{
			map.put("queryid", qr.getQueryid());
            map.put("query", qr.getQuery());
            map.put("requestDate", qr.getRequestDate());
            map.put("queryResponse", qr.getQueryResponse());
            map.put("queryResponseDate", qr.getQueryResponseDate());
            map.put("status", qr.getStatus());
            map.put("account_no", qr.getAccount().getAccount_no());
		}
		return map;
	}
	
	
	

	
	@Transactional
	@Override
	public Object updateQuery(QueryRequest qr)
	{
		//QueryRequest q = queryRequestRepo.findById(id).orElse(null);
		Map<String,Object> map=new HashMap<>();
		queryRequestRepo.saveAndFlush(qr);

		map.put("status", "success");
		return map;
	}

}
