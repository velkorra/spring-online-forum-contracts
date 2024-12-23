package org.forum.forumcontracts.input;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReactionCreateForm(
        @NotBlank(message = "Атор обязателен")
        String authorId,
        String threadId,
        String commentId,
        @NotNull(message = "Тип реакции обязателен")
        boolean isLike
) {
    @AssertTrue(message = "Необходимо указать только один идентификатор")
    public boolean hasExactlyOneId() {
        return (threadId != null && commentId == null) ||
                (threadId == null && commentId != null);
    }
}
