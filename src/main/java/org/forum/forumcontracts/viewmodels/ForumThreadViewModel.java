package org.forum.forumcontracts.viewmodels;

import java.util.Date;

public record ForumThreadViewModel(
        String id,
        String title,
        String content,
        Date createdAt,
        int viewsCount,
        String category,
        String authorUsername,
        String authorDisplayName,
        int commentsCount,
        int reactionsCount,
        int likesCount,
        int dislikesCount
) {
}
