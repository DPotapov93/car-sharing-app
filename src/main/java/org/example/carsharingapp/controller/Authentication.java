package org.example.carsharingapp.controller;

import org.example.carsharingapp.dto.UserLoginRequestDto;
import org.example.carsharingapp.dto.UserLoginResponseDto;
import org.example.carsharingapp.dto.UserRegistrationRequestDto;
import org.example.carsharingapp.dto.UserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
