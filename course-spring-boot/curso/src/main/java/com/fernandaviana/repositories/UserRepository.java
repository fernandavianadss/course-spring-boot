package com.fernandaviana.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandaviana.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	 
}
