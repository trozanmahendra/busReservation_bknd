package com.mgWork.service;

import java.util.List;

import com.mgWork.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);

	public List<Customer> fetchCustomerList();
	
	public Customer fetchCustomerById(int cust_id);
	
	public Customer fetchCustomerByUsername(String username);
    
}
