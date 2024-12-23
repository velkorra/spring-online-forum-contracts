package org.forum.forumcontracts.viewmodels;

import java.util.Date;

public record ThreadCommentViewModel(
        String id,
        String authorUsername,
        String authorDisplayName,
        String content,
        Date createdAt,
        int reactionsCount,
        int likesCount,
        int dislikesCount,
        int repliesCount
) {
}
