package org.forum.forumcontracts.input;

import jakarta.validation.constraints.NotBlank;

public record UserLoginForm(
        @NotBlank(message = "Email или имя пользователя обязательны")
        String emailOrUsername,
        @NotBlank(message = "Пароль обязателен")
        String password
) {
}
