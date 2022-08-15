package com.example.service;

import com.example.model.QueryRequest;

public interface QueryRequestService {
	
	public Object getAllQueries();
	public Object getQueryByStatus(String status);
	public Object updateQuery(QueryRequest qr);
	public Object getQueryById(int id);
}
