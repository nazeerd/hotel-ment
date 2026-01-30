package com.aop.hotel_ment.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aop.hotel_ment.model.HotelDetails;
import com.aop.hotel_ment.model.MenuItem;
import com.aop.hotel_ment.pojo.UiHotelDetails;
import com.aop.hotel_ment.pojo.UiMenuItem;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MenuItemMapper {
	@Autowired
	ObjectMapper mapper;
	public MenuItem getEntity(UiMenuItem details) {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		MenuItem entity = mapper.convertValue(details, MenuItem.class);
		return entity;
	}
	public UiMenuItem getPojo(MenuItem details) {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		UiMenuItem pojo = mapper.convertValue(details, UiMenuItem.class);
		return pojo;
	}
}
