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
@Table(name="CreditDebitCard")
public class CreditDebitCard {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cardId")
	int cardId;
	
	@Column(name="cardNumber")
	int cardNumber;
	
	@Column(name="cardType", length=20)
	String cardType;
	
	@Column(name="cvv", length=4)
	String cvv;
	
	@Temporal(TemporalType.DATE)
	Date expiryDate;
	
	@Column(name="pin")
	int pin;
	
	@Column(name="creditLimit")
	double creditLimit;
	
	@Column(name="maxCreditLimit")
	double maxCreditLimit;
	
	
	@ManyToOne
	@JoinColumn(name="account_no")
	private Account account;
	
	
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public double getMaxCreditLimit() {
		return maxCreditLimit;
	}
	public void setMaxCreditLimit(double maxCreditLimit) {
		this.maxCreditLimit = maxCreditLimit;
	}

		

}
