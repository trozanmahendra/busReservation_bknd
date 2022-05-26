package com.mgWork.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//Trial Push
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TBLBOOKING")
public class Booking {
	@Id
	@SequenceGenerator(name = "booking_sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "booking_sequence")
	private int booking_Id;
	private int number_Of_Seats;
	private double fare_Amount;
	private double total_fare;
	private int custo_id;
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime date_Of_Booking;
	
	private boolean booking_Status;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="cust_Id")
	private Customer customer_id;
}
