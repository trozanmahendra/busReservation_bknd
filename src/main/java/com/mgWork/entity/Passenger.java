package com.mgWork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TBLPASSENGER")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pass_Id;
	private String pass_Name;
	private int pass_Age;
	private String pass_Gender;
	
//	@OneToOne
//	@JoinColumn(name="booking_id")
	private int booking_id;
//	
//	@OneToOne
//	@JoinColumn(name="seat_id")
//	private SeatMapping seatMapping;

	
	
}
