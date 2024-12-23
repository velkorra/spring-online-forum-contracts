package org.forum.forumcontracts.input;

import jakarta.validation.constraints.NotBlank;

public record ThreadCommentUpdateForm(
        @NotBlank
        String id,
        @NotBlank
        String content
) {
}
