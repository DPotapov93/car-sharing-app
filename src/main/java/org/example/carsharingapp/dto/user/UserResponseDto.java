package org.example.carsharingapp.dto.user;

import org.example.carsharingapp.model.User;

public record UserResponseDto(
        Long id,
        String email,
        String firstName,
        String lastName,
        User.Role role) {
}
