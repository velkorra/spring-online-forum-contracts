package org.forum.forumcontracts.input;

import jakarta.validation.constraints.NotBlank;

public record ThreadCreateFrom(
        @NotBlank
        String title,
        @NotBlank
        String content,
        @NotBlank
        String category,
        @NotBlank
        String authorId
) {

}
