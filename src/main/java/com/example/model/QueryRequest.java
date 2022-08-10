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
@Table(name="QueryRequest")
public class QueryRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMP_ID", nullable=false)
	int queryid;
	
	@Column(name="query", length=100)
	String query;
	
	@Temporal(TemporalType.DATE)
	Date requestDate;
	
	@Column(name="queryResponse", length=20)
	String queryResponse;
	
	@Temporal(TemporalType.DATE)
	Date queryResponseDate;
	
	@Column(name="status", length=20)
	String status;


	@ManyToOne
	@JoinColumn(name="account_no")
	private Account account;
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getQueryid() {
		return queryid;
	}

	public void setQueryid(int queryid) {
		this.queryid = queryid;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getQueryResponse() {
		return queryResponse;
	}

	public void setQueryResponse(String queryResponse) {
		this.queryResponse = queryResponse;
	}

	public Date getQueryResponseDate() {
		return queryResponseDate;
	}

	public void setQueryResponseDate(Date queryResponseDate) {
		this.queryResponseDate = queryResponseDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
	

}
