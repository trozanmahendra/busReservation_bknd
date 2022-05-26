package com.mgWork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgWork.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public Customer findByUsername(String username);
}
