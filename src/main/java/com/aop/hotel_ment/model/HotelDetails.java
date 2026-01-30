package com.aop.hotel_ment.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class HotelDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String name;
	private String ownerName;
	private String ownerNumber;
	private String emailId;
	private String uniqueNumber;
	private String address;
	private String password;
	//image
}
