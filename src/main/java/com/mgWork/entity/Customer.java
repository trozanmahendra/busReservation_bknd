package com.mgWork.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TBLCUSTOMER")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_Id;
	private String cust_Name;
	private int cust_Contact;
	private String cust_Email;
	private String username;
	private String password;
	private boolean account_Status;
	
//	@OneToMany(mappedBy="cust_Id")
//	private List<Booking>bookings;

}
