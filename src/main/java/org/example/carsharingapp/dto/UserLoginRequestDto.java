package org.example.carsharingapp.dto;

public record UserLoginRequestDto(
        String email,
        String password) {
}
