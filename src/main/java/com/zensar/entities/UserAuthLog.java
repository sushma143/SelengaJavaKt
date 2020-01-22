package com.zensar.entities;

import javax.persistence.Entity;

@Entity
public class UserAuthLog {
	
	//entity class
	//token id
	//username
	//hashedPassword
	//user id
	private int userId;
	private String usernane;
	private String hashedPassword;
	
	public UserAuthLog() {
		// TODO Auto-generated constructor stub
	}
	
	public UserAuthLog(int userId, String usernane, String hashedPassword) {
		super();
		this.userId = userId;
		this.usernane = usernane;
		this.hashedPassword = hashedPassword;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsernane() {
		return usernane;
	}

	public void setUsernane(String usernane) {
		this.usernane = usernane;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	@Override
	public String toString() {
		return "UserAuthLog [userId=" + userId + ", usernane=" + usernane + ", hashedPassword=" + hashedPassword + "]";
	}
	
	
	
	

}
