package org.example.carsharingapp.controller;

import org.example.carsharingapp.dto.user.UserLoginRequestDto;
import org.example.carsharingapp.dto.user.UserLoginResponseDto;
import org.example.carsharingapp.dto.user.UserRegistrationRequestDto;
import org.example.carsharingapp.dto.user.UserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class Authentication {
    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDto register(@RequestBody UserRegistrationRequestDto requestDto) {
        return null;
    }

    @PostMapping("/login")
    public UserLoginResponseDto login(@RequestBody UserLoginRequestDto requestDto) {
        return null;
    }
}
