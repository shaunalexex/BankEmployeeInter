package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "customerRequestList")
	private List<AddOnCard> addOnCards;
	
	@OneToMany(mappedBy = "customerRequestList")
	private List<LostStolen> lostStolen;
	
	@OneToMany(mappedBy = "customerRequestList")
	private List<IncreaseCreditLimit> increaseCreditLimit;
	
	@OneToMany(mappedBy = "customerRequestList")
	private List<ChequeBookRequest> chequeBookRequest;

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
