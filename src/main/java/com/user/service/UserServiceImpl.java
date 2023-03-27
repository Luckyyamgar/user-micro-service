package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements Userservice {

	// dummy database
	List<User> list = List.of(new User(100L, "mhaku", "7350066384"), new User(101L, "onkar", "7750066384"),
			new User(102L, "suraj", "7450066384"), new User(103L, "pradip", "7650066384"));

	@Override
	public User getUser(Long id) {

		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
