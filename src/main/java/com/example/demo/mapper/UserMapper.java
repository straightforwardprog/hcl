package com.example.demo.mapper;

import com.example.demo.dto.ConsumptionDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.Consumption;
import com.example.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}
