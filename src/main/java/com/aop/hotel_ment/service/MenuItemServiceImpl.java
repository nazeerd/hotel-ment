package com.aop.hotel_ment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aop.hotel_ment.model.MenuItem;
import com.aop.hotel_ment.pojo.UiMenuItem;
import com.aop.hotel_ment.repo.MenuItemRepo;
import com.aop.hotel_ment.util.MenuItemMapper;
@Service
public class MenuItemServiceImpl implements IMenuItemService{
	
	@Autowired
	MenuItemMapper mapper;
	@Autowired
	MenuItemRepo itemRepo;
	
	public List<UiMenuItem> add(List<UiMenuItem> menuItems) {
		
		for (UiMenuItem uiMenuItem : menuItems) {
			MenuItem entity = mapper.getEntity(uiMenuItem);
			entity = itemRepo.save(entity);
			uiMenuItem.setId(entity.getId());
		}
		return menuItems;
	}

	@Override
	public List<UiMenuItem> fetch(List<UiMenuItem> menuItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UiMenuItem> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<UiMenuItem> modify(List<UiMenuItem> menuItems) {
		// TODO Auto-generated method stub
		return null;
	}

}
