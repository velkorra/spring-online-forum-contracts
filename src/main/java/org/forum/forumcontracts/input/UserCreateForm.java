package org.forum.forumcontracts.input;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserCreateForm(
        @NotBlank(message = "Email обязателен")
        @Email(message = "Неверный формат email")
        String email,

        @NotBlank(message = "Имя пользователя обязательно")
        @Pattern(regexp = "^[^@]+$", message = "Имя пользователя не может содержать символ @")
        String username,

        @NotBlank(message = "Пароль обязателен")
        String password,

        @NotBlank(message = "Роль обязательна")
        String role,

        String displayName
) {
        public static UserCreateForm blank(){
                return new UserCreateForm(null, null, null, null, null);
        }
}
