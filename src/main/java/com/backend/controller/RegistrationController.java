package com.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entity.User;
import com.backend.service.RegistrationService;

@RestController         // Creation of restful web api
public class RegistrationController {

	
	@Autowired                     //Autowired method Automatially inject the message property from xml file
	private RegistrationService service;
	
	
	@PostMapping("/registration")      //Post-mapping handle the https post request
	
	@CrossOrigin(origins="http://localhost:4200")     // CrossOrigin is used to enable the cross policies
	public User registrationUser(@RequestBody User user) throws Exception {
		String tempEmailId=user.getEmailId();
		if(tempEmailId !=null && !"".equals(tempEmailId)) {
			User userobj= service.fetchUserByEmailId(tempEmailId);
		if(userobj !=null) {
			throw new Exception ("user with this id is already exist");
			
		}
		
		
		}
		User userObj=null;
		
		userObj=service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")             //Postmapping handle the http post request
	@CrossOrigin(origins ="http://localhost:4200")                // CrossOrigin is used to enable the cross policies
	public User loginUser(@RequestBody User user) throws Exception {
		
		String tempEmailId=user.getEmailId();
		String tempPass=user.getPassword(); 
		
		User userObj=null;
		if(tempEmailId !=null  && tempPass !=null) {
			 userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userObj ==null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}
	
}

