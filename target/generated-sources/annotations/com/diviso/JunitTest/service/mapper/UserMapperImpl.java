package com.diviso.JunitTest.service.mapper;

import com.diviso.JunitTest.domain.User;

import com.diviso.JunitTest.service.dto.UserDTO;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2019-01-22T12:06:29+0530",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"

)

@Component

public class UserMapperImpl implements UserMapper {

    @Override

    public User toEntity(UserDTO userDTO) {

        if ( userDTO == null ) {

            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );

        user.setFirstname( userDTO.getFirstname() );

        user.setLastname( userDTO.getLastname() );

        user.setAge( userDTO.getAge() );

        user.setGrade( userDTO.getGrade() );

        user.setCity( userDTO.getCity() );

        user.setEmail( userDTO.getEmail() );

        user.setPassword( userDTO.getPassword() );

        user.setIsActivated( userDTO.getIsActivated() );

        return user;
    }

    @Override

    public UserDTO toDTO(User user) {

        if ( user == null ) {

            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );

        userDTO.setFirstname( user.getFirstname() );

        userDTO.setLastname( user.getLastname() );

        userDTO.setAge( user.getAge() );

        userDTO.setEmail( user.getEmail() );

        userDTO.setPassword( user.getPassword() );

        userDTO.setGrade( user.getGrade() );

        userDTO.setCity( user.getCity() );

        userDTO.setIsActivated( user.getIsActivated() );

        return userDTO;
    }

    @Override

    public List<User> toEntities(List<UserDTO> DTOs) {

        if ( DTOs == null ) {

            return null;
        }

        List<User> list = new ArrayList<User>();

        for ( UserDTO userDTO : DTOs ) {

            list.add( toEntity( userDTO ) );
        }

        return list;
    }

    @Override

    public List<UserDTO> toDTOs(List<User> entities) {

        if ( entities == null ) {

            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>();

        for ( User user : entities ) {

            list.add( toDTO( user ) );
        }

        return list;
    }
}

