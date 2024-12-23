package org.forum.forumcontracts.viewmodels;

import java.util.Date;
import java.util.List;

public record ForumThreadWithCommentsViewModel(
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
        int likeCount,
        int dislikeCount,
        List<ThreadCommentViewModel> comments
) {
}
