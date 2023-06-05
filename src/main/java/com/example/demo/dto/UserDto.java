package com.example.demo.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String personalAddress;
    private String workingAddress;
    private String living;
    private int familySize;
}
