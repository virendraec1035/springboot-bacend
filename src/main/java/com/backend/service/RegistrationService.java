package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.entity.User;
import com.backend.repo.RegistrationRepository;

	@Service     // Service annotation used to indicate that a class belongs to that layer
	public class RegistrationService {

		@Autowired     // Autowired annotation   can be use autowire bean on setter
		private RegistrationRepository registationRespository;
		public User saveUser(User user ) {
			
			return registationRespository.save(user);
			
		}
		
		public User fetchUserByEmailId(String email) {
			return registationRespository.findByEmailId(email);
		}
		public User fetchUserByEmailIdAndPassword(String email, String password) {
			return registationRespository.findByEmailIdAndPassword(email, password);
		}
		
	}


