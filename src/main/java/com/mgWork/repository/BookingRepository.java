package com.mgWork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mgWork.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
