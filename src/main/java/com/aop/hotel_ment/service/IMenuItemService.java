package com.aop.hotel_ment.service;

import java.util.List;

import com.aop.hotel_ment.pojo.UiMenuItem;

public interface IMenuItemService {
	
	public List<UiMenuItem> add(List<UiMenuItem> menuItem);
	public List<UiMenuItem> fetch(List<UiMenuItem> menuItem);
	public List<UiMenuItem> fetchAll();
	public List<UiMenuItem> modify(List<UiMenuItem> menuItems);
}
