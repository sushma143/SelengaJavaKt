package com.zensar.dao;

import java.util.List;

import com.zensar.entities.Customer;

public interface CustomerDao {

	void add(Customer customer);
			
	void update(Customer customer);

	void delete(Customer customer);

	Customer getCustomer(int customerId);

	Customer deleteById(int customerId);
		
	List<Customer> getAll();
	public String getMd5Hash( String password);
}
