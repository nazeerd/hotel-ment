package com.aop.hotel_ment.model;

import java.time.LocalDate;
import java.util.List;

import com.aop.hotel_ment.pojo.UiOrderMItem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class CustomerOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public Long orderId;
	@Column(columnDefinition = "jsonb")
	public String orderList;
	public Long grandTotal;
	public String hotelUniqueNo;
	public String tableNo;
	public LocalDate orderedDate;

}
