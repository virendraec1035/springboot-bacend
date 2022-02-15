package com.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.entity.User;


public interface RegistrationRepository extends JpaRepository<User, Integer>{

	public User findByEmailId(String emailId);
	
	public User findByEmailIdAndPassword(String emailId, String password);
}
