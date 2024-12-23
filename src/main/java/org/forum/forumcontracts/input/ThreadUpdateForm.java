package org.forum.forumcontracts.input;

import jakarta.validation.constraints.NotBlank;

public record ThreadUpdateForm(
        @NotBlank
        String id,
        @NotBlank
        String title,
        @NotBlank
        String content,
        @NotBlank
        String category
) {
}
