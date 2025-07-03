package com.springtest.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtest.test.model.User;
import com.springtest.test.repository.UserRepository;
import com.springtest.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findUserById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(int id) {
		userRepository.deleteById(id);

	}

}