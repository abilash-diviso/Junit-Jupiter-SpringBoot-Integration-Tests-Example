package com.diviso.JunitTest.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.diviso.JunitTest.domain.User;
import com.diviso.JunitTest.service.dto.UserDTO;

@Mapper(componentModel="spring")
public interface UserMapper {

	User toEntity(UserDTO userDTO);

	UserDTO toDTO(User user);

	List<User> toEntities(List<UserDTO> DTOs);

	List<UserDTO> toDTOs(List<User> entities);
}
