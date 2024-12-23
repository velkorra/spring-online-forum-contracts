package org.forum.forumcontracts.filters;

import java.time.LocalDateTime;

public record ThreadCommentFilter(
        String id,
        String authorUsername,
        String content,
        String threadId,
        String parentCommentId,
        LocalDateTime createdAfter,
        LocalDateTime createdBefore,
        Boolean includeDeleted
) {
    public static ThreadCommentFilter blank(){
        return new ThreadCommentFilter(null, null, null, null, null, null, null, false);
    }
    public ThreadCommentFilter withTreadId(String threadId){
        return new ThreadCommentFilter(id, authorUsername, content, threadId, parentCommentId, createdAfter, createdBefore, includeDeleted);
    }
}