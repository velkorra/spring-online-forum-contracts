package org.forum.forumcontracts.input;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserUpdateForm(
        @NotBlank(message = "Идентификатор пользователя обязателен")
        String id,

        @Email(message = "Неверный формат email")
        String email,

        @NotBlank(message = "Имя пользователя обязательно")
        @Pattern(regexp = "^[^@]+$", message = "Имя пользователя не может содержать символ @")
        String username,

        @NotBlank(message = "Роль обязательна")
        String role,

        String displayName
) {
}
