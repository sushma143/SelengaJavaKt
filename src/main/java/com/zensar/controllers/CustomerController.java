package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.entities.Customer;
import com.zensar.entities.User;
import com.zensar.entities.UserAuthLog;
import com.zensar.service.CustomerService;

@RestController
@RequestMapping(path="/user")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@PostMapping("/add")
	public String add(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return customer.getId() + "added successfully";
	}
	@PutMapping("/update")
	public String update(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		return customer.getId() + "updated successfully";
	}

	@DeleteMapping("/delete")
	public String delete(@RequestBody Customer customer) {
		customerService.deleteCustomer(customer);
		return customer.getId() + "deleted successfully";
	}

	@GetMapping("/{id}")
	public Customer get(@PathVariable("id") int customerId) {
		return customerService.getById(customerId);
	}

	@GetMapping("/allUser")
	public List<Customer> getAllCustomer() {
		return customerService.findAllCustomer();
	}
	
	@PostMapping("/auth")
	public UserAuthLog auth(@RequestBody User user) {
		return customerService.userAuth(user);
	}
}
