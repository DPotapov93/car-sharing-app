package org.example.carsharingapp.dto.user;

public record UserLoginRequestDto(
        String email,
        String password) {
}
