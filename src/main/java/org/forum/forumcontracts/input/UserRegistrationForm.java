package org.forum.forumcontracts.input;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserRegistrationForm(
        @NotBlank(message = "Email обязателен")
        @Email(message = "Неверный формат email")
        String email,

        @NotBlank(message = "Имя пользователя обязательно")
        @Pattern(regexp = "^[^@]+$", message = "Имя пользователя не может содержать символ @")
        String username,

        @NotBlank(message = "Пароль обязателен")
        String password,

        @NotBlank(message = "Пароль обязателен")
        String confirmPassword,

        @NotBlank(message = "Укажите ваше имя")
        String displayName

) {
    @AssertTrue(message = "Пароли не совпадают!")
    public boolean isPasswordMatch() {
        if (password == null || confirmPassword == null) {
            return true;
        }
        return password.equals(confirmPassword);
    }

    public static UserRegistrationForm blank() {
        return new UserRegistrationForm(null, null, null, null, null);
    }
}
