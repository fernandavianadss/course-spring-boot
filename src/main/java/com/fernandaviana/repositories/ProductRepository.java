package com.fernandaviana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandaviana.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	 
}
