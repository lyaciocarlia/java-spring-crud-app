package com.example.demo.dto;

import com.example.demo.model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank @Size(max = 50) String username,
        @NotBlank @Email @Size(max = 160) String email,
        @NotBlank @Size(min = 6, max = 100) String password,
        Role role
) {}
