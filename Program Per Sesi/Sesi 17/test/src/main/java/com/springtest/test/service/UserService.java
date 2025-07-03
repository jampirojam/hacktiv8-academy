package com.springtest.test.service;

import java.util.List;
import java.util.Optional;

import com.springtest.test.model.User;

public interface UserService{
	List<User> findAllUser(); 

	Optional<User> findUserById(int id);

	User saveUser(User user);

	void deleteUserById(int id);
}
