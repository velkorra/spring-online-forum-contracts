package org.forum.forumcontracts.input;

import jakarta.validation.constraints.NotBlank;

public record NewThreadForm(
        @NotBlank(message = "Название обязательно")
        String title,
        @NotBlank(message = "Тема не может быть пустой!")
        String content,
        @NotBlank(message = "Выберите категорию")
        String category
) {
    public static NewThreadForm blank() {
        return new NewThreadForm("", "", "");
    }
}
