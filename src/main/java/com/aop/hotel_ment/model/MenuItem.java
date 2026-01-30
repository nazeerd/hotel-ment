package com.aop.hotel_ment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class MenuItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String hotelUniqueNo;
	private Integer price;
	private String description;
	private boolean isReady;
	private Integer type;
	//private byte[] image;
}
