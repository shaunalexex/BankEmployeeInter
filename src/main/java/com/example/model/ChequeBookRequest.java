package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

@Table(name = "ChequeBookRequest")
public class ChequeBookRequest {
	
	@Id

    @GeneratedValue(strategy  = GenerationType.AUTO)
	
	@Column(name = "chequebook_id")
	private int chequebook_id;
	
	@Column(name = "no_of_leaves")
	private int no_of_leaves;
	
	@Temporal(TemporalType.DATE)
	private Date request_date;
	
	@Temporal(TemporalType.DATE)
	private Date response_date;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "request_id")
	private int request_id;
	
	@Column(name = "account_no", length = 16)
	private int account_no;

	public int getChequebook_id() {
		return chequebook_id;
	}

	public void setChequebook_id(int chequebook_id) {
		this.chequebook_id = chequebook_id;
	}

	public int getNo_of_leaves() {
		return no_of_leaves;
	}

	public void setNo_of_leaves(int no_of_leaves) {
		this.no_of_leaves = no_of_leaves;
	}

	public Date getRequest_date() {
		return request_date;
	}

	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}

	public Date getResponse_date() {
		return response_date;
	}

	public void setResponse_date(Date response_date) {
		this.response_date = response_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	
	

}
