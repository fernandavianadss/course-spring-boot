package com.fernandaviana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandaviana.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	 
}
