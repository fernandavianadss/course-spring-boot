package com.fernandaviana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandaviana.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	 
}
