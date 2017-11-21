package com.mlebeau.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/** Class for customer POJO of eShop project */
@Entity
public class Customer {

	/** Technical ID for Database */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	/** Last name of customer */
	@Column(nullable=false, length=255)
	private String lastName;
	
	@Column(nullable=false, length=255)
	private String firstName;
	
	@Column(length=15)
	private String phone = "+33";
	
	@Column(length=255)
	private String address;
	
	@Column(length=5)
	private int CP;
	
	@Column(length=255)
	private String city;
	
	@Column
	@OneToMany(cascade = CascadeType.ALL)
	private List<Order> orders;
	
	public Customer(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		return String.format("Customer[lastName='%s', firstName='%s']", this.lastName, this.firstName);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
