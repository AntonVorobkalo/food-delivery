package com.fooddelivery.userService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserDTO(
        Long id,

        @NotBlank(message = "Имя не может быть пустым")
        String name,

        @NotBlank(message = "Email не может быть пустым")
        @Email(message = "Некорректный формат email")
        String email,

        @NotBlank(message = "Номер телефона не может быть пустым")
        @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Некорректный формат телефона")
        String phoneNumber
) {}
