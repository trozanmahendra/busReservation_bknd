package com.mgWork.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mgWork.entity.Bus;
import com.mgWork.service.BusService;

@RestController
public class TicketBookingController {

	@Autowired
	private BusService busService;

	@PostMapping("/search")
	public List<Bus> fetchBusesByOriginAndDestination(@RequestBody Bus bus) {
		return busService.fetchBySourceAndDestination(bus.getSource(), bus.getDestination());
	}
}
