package com.mgWork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgWork.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
