package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "CustomerRequestList")


public class CustomerRequestList {
	
	@Id

    @GeneratedValue(strategy  = GenerationType.AUTO)
	
	@Column(name = "request_id")
	private int request_id;
	
	@Column(name = "request_type", length = 30)
	private String request_type;

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public String getRequest_type() {
		return request_type;
	}

	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}
	
	

}
