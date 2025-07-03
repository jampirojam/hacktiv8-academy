package com.springtest.test.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springtest.test.model.User;
import com.springtest.test.repository.UserRepository;
import com.springtest.test.service.UserService;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping(value = "/home")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@PostMapping("/user")
	@CrossOrigin(origins = "http://localhost:8082")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/user/id/{id}")
	public ResponseEntity<?> findUserById(@PathVariable int id) {
		Optional<User> user = userService.findUserById(id);
		if (user.isEmpty()) {
			return new ResponseEntity<>("ID user tidak ditemukan", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@DeleteMapping("/user")
	public ResponseEntity<?> deleteUser(@RequestParam int id) {
		userService.deleteUserById(id);
		return new ResponseEntity<>("User user", HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<?> updateUserById(@RequestBody User user, @RequestParam int id) {
		try {
			Optional<User> checkUser = userService.findUserById(id);
			if (checkUser.isEmpty()) {
				return new ResponseEntity<>("ID user tidak sesuai", HttpStatus.BAD_REQUEST);
			}
			user.setId(id);
			userService.saveUser(user);
			
			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}

}