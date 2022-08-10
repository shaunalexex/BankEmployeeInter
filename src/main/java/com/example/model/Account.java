package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="account_no")
	private int account_no;
	@Column(name="account_type",length=45)
	private String account_type;
	@Column(name="customer_customer_id")
	private int customer_customer_id;
	@Column(name="account_balance",length=10,precision=2)
	private double account_balance;
	@Column(name="ifsc_code",length=45)
	private String ifsc_code;
	@Column(name="bank_name",length=45)
	private String bank_name;
	@Column(name="branch_name",length=45)
	private String branch_name;
	@OneToMany(mappedBy = "account")
	private List<AddOnCard> addOnCards;
	
	public List<AddOnCard> getAddOnCards() {
		return addOnCards;
	}
	public void setAddOnCards(List<AddOnCard> addOnCards) {
		this.addOnCards = addOnCards;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public int getCustomer_customer_id() {
		return customer_customer_id;
	}
	public void setCustomer_customer_id(int customer_customer_id) {
		this.customer_customer_id = customer_customer_id;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	
	


}

