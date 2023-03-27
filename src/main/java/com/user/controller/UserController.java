package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private RestTemplate restTemplate;// Helping of one service connect to another microservice
	@Autowired
	private Userservice userservice;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long id) {
		// return userservice.getUser(id);
		User user = userservice.getUser(id);
		// http://localhost:8082/contact/user/11
//		List contact = this.restTemplate.getForObject("http://localhost:8082/contact/user/" + user.getUserId(),
//				List.class);
		List contact = this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId(),
				List.class);
		user.setContact(contact);
		return user;
	}
}
