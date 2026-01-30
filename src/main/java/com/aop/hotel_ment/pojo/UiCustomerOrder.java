package com.aop.hotel_ment.pojo;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;


@Data
public class UiCustomerOrder {
	public Long id;
	public Long orderId;
	public List<UiOrderMItem> orderList;
	public Long grandTotal;
	public String hotelUniqueNo;
	public String tableNo;
	public LocalDate orderedDate;
}
