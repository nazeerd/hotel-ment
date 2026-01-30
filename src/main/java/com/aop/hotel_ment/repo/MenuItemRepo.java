package com.aop.hotel_ment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aop.hotel_ment.model.MenuItem;

@Repository
public interface MenuItemRepo extends JpaRepository<MenuItem, Long>{

}
