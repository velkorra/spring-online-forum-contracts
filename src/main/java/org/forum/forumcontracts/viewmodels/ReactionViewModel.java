package org.forum.forumcontracts.viewmodels;


import java.time.LocalDateTime;

public record ReactionViewModel(
        String authorId,
        String threadId,
        String commentId,
        boolean isLike,
        LocalDateTime createdOn
) {
}
