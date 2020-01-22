package com.zensar.dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void add(Customer customer) {
		customer.setHashedPass(getMd5Hash("test12345"));
		hibernateTemplate.save(customer);
				
	}

	public void update(Customer customer) {
		hibernateTemplate.update(customer);

	}

	public void delete(Customer customer) {
		hibernateTemplate.delete(customer);
	}

	public Customer getCustomer(int customerId) {
		return hibernateTemplate.get(Customer.class, customerId);

	}

	public List<Customer> getAll() {
		return (List<Customer>) hibernateTemplate.find("from Customer");
	}

	@Override
	public Customer deleteById(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getMd5Hash(String password) {
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(password.getBytes());
			byte[] digest = messageDigest.digest();
			String myHash = DatatypeConverter.printHexBinary(digest).toUpperCase();
			System.err.println("Debug: Hash succeeded.");
			return myHash;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}



}
