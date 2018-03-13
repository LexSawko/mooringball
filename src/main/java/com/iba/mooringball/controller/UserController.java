package com.iba.mooringball.controller;

import com.iba.mooringball.entity.ApplicationUser;
import com.iba.mooringball.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@PostMapping("/sign-up")
	public void signUp(@RequestBody ApplicationUser applicationUser) {
		applicationUser.setPassword(bCryptPasswordEncoder.encode(applicationUser.getPassword()));
		userRepository.save(applicationUser);
	}
}
