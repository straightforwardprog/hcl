package com.example.demo.service;

import com.example.demo.dto.UserDto;

import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import org.mapstruct.factory.Mappers;

public class UserService implements IUserService{
    private UserMapper mapper
            = Mappers.getMapper(UserMapper.class);
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto register(UserDto user) {
         userRepository.save(mapper.toEntity(user));
         return user;
    }
}
