package com.aop.hotel_ment.service;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.hotel_ment.model.HotelDetails;
import com.aop.hotel_ment.pojo.UiHotelDetails;
import com.aop.hotel_ment.repo.HotelDetailsRepo;
import com.aop.hotel_ment.util.HotelDetailsMapper;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class HotelManagementServiceImpl implements IHotelManagementService {
	
	@Autowired
	HotelDetailsMapper mapper;
	@Autowired
	HotelDetailsRepo repo;

	@Override
	public UiHotelDetails onboard(UiHotelDetails hotelDetails) {
		// TODO Auto-generated method stub
		HotelDetails entityDetails = null;
		entityDetails = mapper.getEntity(hotelDetails);
		entityDetails.setUniqueNumber(String.valueOf(Instant.now().toEpochMilli()));
		repo.save(entityDetails);
		hotelDetails = mapper.getPojo(entityDetails);
		return hotelDetails;
	}

}
