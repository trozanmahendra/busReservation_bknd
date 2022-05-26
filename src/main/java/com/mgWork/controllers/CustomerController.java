package com.mgWork.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgWork.entity.Customer;
import com.mgWork.service.CustomerService;
@RestController
public class CustomerController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		LOGGER.info("saveCustomer method invoked");
		return customerService.saveCustomer(customer);	
	}
	@GetMapping("/customerlist")
	public List<Customer> fetchCustomerList(){
		return customerService.fetchCustomerList();
		
	}
	@GetMapping("/customerlist/{id}")
	public Customer fetchCustomerById(@PathVariable("id") int id) {
		return customerService.fetchCustomerById(id);
		
	}
}
