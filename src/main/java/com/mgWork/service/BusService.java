package com.mgWork.service;

import java.util.List;

import com.mgWork.entity.Bus;

public interface BusService {

	public List<Bus> fetchBySourceAndDestination(String source,String destination);
	
	public Bus saveBus(Bus bus);
	public List<Bus> fetchBuses();
}
