package com.aop.hotel_ment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aop.hotel_ment.pojo.UiHotelDetails;
import com.aop.hotel_ment.pojo.UiMenuItem;
import com.aop.hotel_ment.service.IMenuItemService;

@RestController
@RequestMapping("/menu-item")
public class MenuItemCotroller {
	@Autowired
	private IMenuItemService menuItemService;
	@PostMapping
	public ResponseEntity<?> add(@RequestHeader("hotelUniqueNo") String hotelUniqueId, @RequestBody List<UiMenuItem> menuItems){
		 menuItemService.add(menuItems);
		return ResponseEntity.ok("Menu details are added..");
	}
	@GetMapping
	public ResponseEntity<?> fetchAll(@RequestHeader("hotelUniqueNo") String hotelUniqueId){
		return ResponseEntity.ok("Menu details are here..");
	}
	@GetMapping(value = "/some")
	public ResponseEntity<?> fetchSome(@RequestHeader("hotelUniqueNo") String hotelUniqueId){
		return ResponseEntity.ok("Menu details are here..");
	}
	@PutMapping
	public ResponseEntity<?> modify(@RequestHeader("hotelUniqueNo") String hotelUniqueId){
		return ResponseEntity.ok("Menu details are modified..");
	}

}
