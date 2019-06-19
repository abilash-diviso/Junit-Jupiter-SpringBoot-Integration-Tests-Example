package com.diviso.JunitTest.controller;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.http.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.JunitTest.service.UserService;
import com.diviso.JunitTest.service.dto.UserDTO;

@RestController
@RequestMapping("/api")
public class UserController {

	private final Logger log = LoggerFactory.getLogger(UserController.class);

	private final UserService userService;

	public UserController(UserService userService) {

		this.userService = userService;
	}

	@PostMapping("/users")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
		log.info("Request to save User " + userDTO);
		UserDTO result = userService.createUser(userDTO);
		return new ResponseEntity<UserDTO>(result, HttpStatus.CREATED);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
		log.info("Request to Get user by " + id);
		Optional<UserDTO> userDTO = userService.getUser(id);
		return new ResponseEntity<UserDTO>(userDTO.get(), HttpStatus.OK);
	}

}
