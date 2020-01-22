package com.zensar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.CustomerDao;
import com.zensar.entities.Customer;
import com.zensar.entities.User;
import com.zensar.entities.UserAuthLog;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	public void addCustomer(Customer customer) {
		customerDao.add(customer);
	}

	public void updateCustomer(Customer customer) {
		customerDao.update(customer);

	}

	public void deleteCustomer(Customer customer) {
		customerDao.delete(customer);

	}

	public Customer getById(int customerId) {
		return customerDao.getCustomer(customerId);
	}

	public List<Customer> findAllCustomer() {
		return customerDao.getAll();
	}

	public long getCustomerCount() {
		return customerDao.getAll().size();
	}

	@Override
	public String getMd5Hash(String pass) {
		// TODO Auto-generated method stub
		return customerDao.getMd5Hash(pass);
	}

	@Override
	public UserAuthLog userAuth(User user) {
		// TODO Auto-generated method stub
		String hashedPassword = customerDao.getMd5Hash(user.getPassword());
		String userName = user.getUserName();
		
		// check in db
		// generate token
		// entry in userauthlog
		//send response userauthlog
		
		
		
		return null;
	}



	
}
