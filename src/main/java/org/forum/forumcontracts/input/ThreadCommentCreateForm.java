package org.forum.forumcontracts.input;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;

public record ThreadCommentCreateForm(
        @NotBlank
        String authorId,
        @NotBlank
        String threadId,
        String parentCommentId,
        @NotBlank
        String content
) {
}
