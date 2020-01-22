package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Hotel {
	@Id
	private int hotelId;
	private String hotelName;
	private String contactNo;
	private String address;
	private String email;

	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Hotel(int hotelId, String hotelName, String contactNo, String address, String email) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.contactNo = contactNo;
		this.address = address;
		this.email = email;
	}

}
