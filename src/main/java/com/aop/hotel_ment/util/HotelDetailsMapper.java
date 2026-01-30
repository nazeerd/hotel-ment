package com.aop.hotel_ment.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aop.hotel_ment.model.HotelDetails;
import com.aop.hotel_ment.pojo.UiHotelDetails;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class HotelDetailsMapper {
	@Autowired
	ObjectMapper mapper;
	public HotelDetails getEntity(UiHotelDetails details) {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		HotelDetails entity = mapper.convertValue(details, HotelDetails.class);
		return entity;
	}
	public UiHotelDetails getPojo(HotelDetails details) {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		UiHotelDetails pojo = mapper.convertValue(details, UiHotelDetails.class);
		return pojo;
	}

}
