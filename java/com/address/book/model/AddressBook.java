package com.address.book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AddressBook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; 
	private String name;
	private String phoneNumber;
	private String email; 
	private String address;
	public AddressBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressBook(int id, String name, String phoneNumber, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	@Override
	public String toString() {
		return "AddressBook [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + "]";
	}
	

}
