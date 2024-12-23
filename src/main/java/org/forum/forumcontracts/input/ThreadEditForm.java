package org.forum.forumcontracts.input;

import jakarta.validation.constraints.NotBlank;

public record ThreadEditForm(
        @NotBlank
        String id,
        @NotBlank
        String title,
        @NotBlank
        String content
) {
}

