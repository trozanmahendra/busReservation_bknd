package com.mgWork.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgWork.entity.Booking;
import com.mgWork.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService;

	@PostMapping("/booking")
	public Booking savebooking(@RequestBody Booking booking) {
		return bookingService.saveBoooking(booking);

	}
	@GetMapping("/bookinglist")
	public List<Booking> fetchBookingList() {
		return bookingService.fetchBooking();

	}
}
