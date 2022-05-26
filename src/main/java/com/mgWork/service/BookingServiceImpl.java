package com.mgWork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgWork.entity.Booking;
import com.mgWork.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;
//	@Autowired(required = true)
//	private Customer customer;
	
	@Autowired
	private CustomerService customerService;
	@Override
	public Booking saveBoooking(Booking booking) {
		
		int c_id = booking.getCusto_id();
		
		boolean flag = customerService.fetchCustomerById(c_id).isAccount_Status();
		System.out.println("****************"+flag+"*********************"+booking+"==========="+customerService.fetchCustomerById(c_id));
		if (flag) 
		return bookingRepository.save(booking);
		
		 else {
			 throw new NullPointerException("no data");
//			 return null; 
		 }
			
	}

	@Override
	public List<Booking> fetchBooking() {
		return bookingRepository.findAll();
	}

}
