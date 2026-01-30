package com.aop.hotel_ment.pojo;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UiMenuItem {
	@Id
	private Long id;
	private String name;
	private String hotelUniqueNo;
	private Integer price;
	private String description;
	private boolean isReady;
	private Integer type;
	//private byte[] image;
}
