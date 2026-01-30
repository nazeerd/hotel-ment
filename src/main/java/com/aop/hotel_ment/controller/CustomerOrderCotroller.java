package com.aop.hotel_ment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.hotel_ment.pojo.UiCustomerOrder;
import com.aop.hotel_ment.pojo.UiHotelDetails;
import com.aop.hotel_ment.pojo.UiMenuItem;

@RestController
@RequestMapping("/order")
public class CustomerOrderCotroller {
	
	@PostMapping
	public ResponseEntity<?> placeOrder(@RequestHeader("hotelUniqueNo") String hotelUniqueId, @RequestBody UiCustomerOrder order){
		return ResponseEntity.ok("Customer order is placed..");
	}
	@GetMapping
	public ResponseEntity<?> fetch(@RequestHeader("hotelUniqueNo") String hotelUniqueId){
		return ResponseEntity.ok("Customer order details are here..");
	}
	@PutMapping
	public ResponseEntity<?> modify(@RequestHeader("hotelUniqueNo") String hotelUniqueId){
		return ResponseEntity.ok("Customer order  modified..");
	}

}
