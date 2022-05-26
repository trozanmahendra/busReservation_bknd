package com.mgWork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgWork.entity.Bus;
import com.mgWork.repository.BusRepository;
@Service
public class BusServiceImpl  implements BusService{
	
	@Autowired
	private BusRepository busRepository;
	
	public List<Bus> fetchBySourceAndDestination(String source, String destination) {
		
		return busRepository.findBySourceAndDestination(source , destination);
	}

	@Override
	public Bus saveBus(Bus bus) {
		return busRepository.save(bus);
	}

	@Override
	public List<Bus> fetchBuses() {
		
		return busRepository.findAll();
	}

}
