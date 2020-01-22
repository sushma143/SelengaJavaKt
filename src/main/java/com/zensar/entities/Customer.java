package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Customer {
	@Id
	private int id;
	private String name;
	private String contactNo;
	private String email;
	private String hashedPass;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
//	

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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashedPass() {
		return hashedPass;
	}

	public void setHashedPass(String hashedPass) {
		this.hashedPass = hashedPass;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", email=" + email
				+ ", hashedPass=" + hashedPass + "]";
	}
	public Customer(int id, String name, String contactNo, String email, String hashedPass) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.email = email;
		this.hashedPass = hashedPass;
	}


}
