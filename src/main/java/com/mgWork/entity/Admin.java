package com.mgWork.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "TBLADMIN")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adm_id;
	private String adm_name;
	private String adm_contact;
	private String adm_email;
	private String username;//My password
	private String password;

//	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
////	@JoinColumn(name = "a_id",referencedColumnName = "adm_id")
//	private List<Bus> buses;

	


	
	

	

}
