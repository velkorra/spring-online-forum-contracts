package org.forum.forumcontracts.input;

import jakarta.validation.constraints.NotBlank;

public record CommentEditForm(
        @NotBlank(message = "Нельзя оставить пустой комментарий")
        String content
) {
}
