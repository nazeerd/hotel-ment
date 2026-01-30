package com.aop.hotel_ment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aop.hotel_ment.model.CustomerOrder;

@Repository
public interface CutomerOrderRepo extends JpaRepository<CustomerOrder, Long>{

}
