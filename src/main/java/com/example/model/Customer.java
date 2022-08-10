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
@Table(name="Customer")
public class Customer  {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="customer_id")
		private int customer_id;
		@Column(name="customer_name",length=45)
		private String customer_name;
		@Column(name="phone_no")
		private int phone_no;
		@Column(name="email",length=45)
		private String email;
		@Column(name="address",length=45)
		private String address;
		@Column(name="city",length=45)
		private String city;
		@Column(name="pincode")
		private int pincode;
		@Column(name="country",length=45)
		private String country;
		@Temporal(TemporalType.DATE)
		private Date dob;
		@Column(name="pan",length=45)
		private String pan;
		public int getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}
		public String getCustomer_name() {
			return customer_name;
		}
		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}
		public int getPhone_no() {
			return phone_no;
		}
		public void setPhone_no(int phone_no) {
			this.phone_no = phone_no;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getPan() {
			return pan;
		}
		public void setPan(String pan) {
			this.pan = pan;
		}
		
		

}
