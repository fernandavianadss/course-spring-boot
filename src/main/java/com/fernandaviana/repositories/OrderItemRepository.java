package com.fernandaviana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandaviana.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	 
}
