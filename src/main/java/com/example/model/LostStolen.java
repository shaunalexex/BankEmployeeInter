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
@Table(name="LostStolen")
public class LostStolen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="LstRequestId")
	int lstRequestId;
	
	@Temporal(TemporalType.DATE)
	Date requestDate;
	
	@Temporal(TemporalType.DATE)
	Date responseDate;
	
	@Column(name="status", length=50, nullable=false)
	String status;
	
	@Column(name="reason", length=50, nullable=false)
	String reason;
	
	@Column(name="requestId")
	int requestId;
	
	@Column(name="accountNo")
	int accountNo;
	
	@Temporal(TemporalType.DATE)
	Date cardStolenDate;

	public int getLstRequestId() {
		return lstRequestId;
	}

	public void setLstRequestId(int lstRequestId) {
		this.lstRequestId = lstRequestId;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
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

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public Date getCardStolenDate() {
		return cardStolenDate;
	}

	public void setCardStolenDate(Date cardStolenDate) {
		this.cardStolenDate = cardStolenDate;
	}
	
	
	

}
