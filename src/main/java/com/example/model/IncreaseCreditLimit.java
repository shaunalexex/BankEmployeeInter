package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity

@Table(name="Credit_Limit")
public class IncreaseCreditLimit {
	
	
	@Id

    @GeneratedValue(strategy  = GenerationType.AUTO)

    @Column(name="creditlimit_id")
	private int creditlimit_id;
	
	@Column(name = "request_credit_Limit", length = 10, precision = 2)
	private float request_credit_Limit;
	
	@Temporal(TemporalType.DATE)
	private Date request_date;
	
	@Temporal(TemporalType.DATE)
	private Date respons_date;
	
	@Column(name = "status", length = 45)
	private String status;
	
	@Column(name = "reason", length = 500)
	private String reason;
	
	
	
	@ManyToOne
	@JoinColumn(name="account_no")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name="request_id")
	private CustomerRequestList customerRequestList;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	
	public CustomerRequestList getCustomerRequestList() {
		return customerRequestList;
	}

	public void setCustomerRequestList(CustomerRequestList customerRequestList) {
		this.customerRequestList = customerRequestList;
	}

	public int getCreditlimit_id() {
		return creditlimit_id;
	}

	public void setCreditlimit_id(int creditlimit_id) {
		this.creditlimit_id = creditlimit_id;
	}

	public float getRequest_credit_Limit() {
		return request_credit_Limit;
	}

	public void setRequest_credit_Limit(float request_credit_Limit) {
		this.request_credit_Limit = request_credit_Limit;
	}

	public Date getRequest_date() {
		return request_date;
	}

	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}

	public Date getRespons_date() {
		return respons_date;
	}

	public void setRespons_date(Date respons_date) {
		this.respons_date = respons_date;
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



	
	
	

}
