package com.aop.hotel_ment.pojo;

import lombok.Data;

@Data
public class UiOrderMItem {
	private Long id;
	private String name;
	private String hotelUniqueNo;
	private Integer price;
	private String description;
	private boolean isReady;
	private Integer type;
	private Integer count;
	private Integer total;
	//private byte[] image;
}
