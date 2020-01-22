package com.zensar.service;

import java.util.List;

import com.zensar.entities.Customer;
import com.zensar.entities.User;
import com.zensar.entities.UserAuthLog;

public interface CustomerService {
      
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
    Customer getById(int customerId);
    List<Customer> findAllCustomer();
    long getCustomerCount();
    String getMd5Hash( String pass);
	UserAuthLog userAuth(User user);

	
}
