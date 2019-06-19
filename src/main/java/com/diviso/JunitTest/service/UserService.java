package com.diviso.JunitTest.service;

import java.util.Optional;

import com.diviso.JunitTest.service.dto.UserDTO;

public interface UserService {

	public UserDTO createUser(UserDTO userDTO);

	public Optional<UserDTO> getUser(Long id);
	
}
