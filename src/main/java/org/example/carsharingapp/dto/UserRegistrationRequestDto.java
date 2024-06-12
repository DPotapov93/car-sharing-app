package org.example.carsharingapp.dto;

public record UserRegistrationRequestDto(
        String email,
        String firstName,
        String lastName,
        String password,
        String repeatPassword) {
}
