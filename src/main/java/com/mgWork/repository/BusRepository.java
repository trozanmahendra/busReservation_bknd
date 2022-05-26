package com.mgWork.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgWork.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer> {

	public List<Bus> findBySourceAndDestination(String source,String destination);
}
