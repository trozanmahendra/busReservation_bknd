package com.mgWork.service;

import java.util.List;

import com.mgWork.entity.Booking;

public interface BookingService {
	public Booking saveBoooking(Booking booking);
	
	public List<Booking> fetchBooking();
	
}
