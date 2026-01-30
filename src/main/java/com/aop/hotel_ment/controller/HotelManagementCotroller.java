package com.aop.hotel_ment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.hotel_ment.pojo.UiHotelDetails;
import com.aop.hotel_ment.service.IHotelManagementService;

@RestController
@RequestMapping("/hotel")
public class HotelManagementCotroller {
	@Autowired
	IHotelManagementService hotelManagementService;
	
	@PostMapping
	public ResponseEntity<?> onboard(@RequestBody UiHotelDetails hotelDetails){
		hotelManagementService.onboard(hotelDetails);
		return ResponseEntity.ok("Hotel details are added..");
	}
	@GetMapping
	public ResponseEntity<?> fetch(){
		return ResponseEntity.ok("Hotel details are here..");
	}
	@PutMapping
	public ResponseEntity<?> modify(){
		return ResponseEntity.ok("Hotel details are modified..");
	}

}
