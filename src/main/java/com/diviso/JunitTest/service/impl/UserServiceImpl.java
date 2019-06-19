package com.diviso.JunitTest.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.diviso.JunitTest.domain.User;
import com.diviso.JunitTest.repository.UserRepository;
import com.diviso.JunitTest.service.UserService;
import com.diviso.JunitTest.service.dto.UserDTO;
import com.diviso.JunitTest.service.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	private final UserMapper userMapper;

	private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;

	}

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		log.info("Request to save User " + userDTO);
		User user = userMapper.toEntity(userDTO);
		user = userRepository.save(user);
		UserDTO result = userMapper.toDTO(user);
		return result;
	}

	@Override
	public Optional<UserDTO> getUser(Long id) {
		log.info("Request to get user by "+id);
		return userRepository.findById(id)
				.map(userMapper::toDTO);
		
	}

}
