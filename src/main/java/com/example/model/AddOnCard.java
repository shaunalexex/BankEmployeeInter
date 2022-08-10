package com.example.model;
import java.util.Date;

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

@Entity
@Table(name="Add_On_Card")
public class AddOnCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="addon_card_request_id")
	private int addon_card_request_id;
	@Temporal(TemporalType.DATE)
	private Date request_date;
	@Temporal(TemporalType.DATE)
	private Date response_date;
	@Column(name="status",length=45)
	private String status;
	@Column(name="reason",length=500)
	private String reason;
	
	
	@ManyToOne
	@JoinColumn(name="account_no")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name="request_id")
	private CustomerRequestList customerRequestList;
	

	
	
	
	public CustomerRequestList getCustomerRequestList() {
		return customerRequestList;
	}
	public void setCustomerRequestList(CustomerRequestList customerRequestList) {
		this.customerRequestList = customerRequestList;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getAddon_card_request_id() {
		return addon_card_request_id;
	}
	public void setAddon_card_request_id(int addon_card_request_id) {
		this.addon_card_request_id = addon_card_request_id;
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
	
	
}
