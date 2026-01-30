package com.aop.hotel_ment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aop.hotel_ment.model.HotelDetails;

@Repository
public interface HotelDetailsRepo extends JpaRepository<HotelDetails, Long>{

}
