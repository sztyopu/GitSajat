package com.sec.service;

import com.sec.entity.User;

public interface UserService {

	public User findByEmail(String email);
	
}
