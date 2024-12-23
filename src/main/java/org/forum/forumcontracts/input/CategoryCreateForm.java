package org.forum.forumcontracts.input;

import jakarta.validation.constraints.NotBlank;

public record CategoryCreateForm(
        @NotBlank(message = "Название категории обязательно")
        String name
) {
}
