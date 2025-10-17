package com.example.demo.dto;

import java.time.Instant;

public record EmployeeResponse(
        Long id,
        String firstName,
        String lastName,
        String email,
        String jobTitle,
        Instant dateHired
) {
}

