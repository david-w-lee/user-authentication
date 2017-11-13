package com.davidwlee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidwlee.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
