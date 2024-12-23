package org.forum.forumcontracts.filters;

import java.time.LocalDateTime;

public record ForumThreadFilter(
        String id,
        String authorUsername,
        String title,
        String content,
        String category,
        String authorDisplayName,
        LocalDateTime createdAfter,
        LocalDateTime createdBefore,
        Boolean includeDeleted
) {
    public static ForumThreadFilter blank() {
        return new ForumThreadFilter(null, null, null, null, null, null, null, null, false);
    }

    public ForumThreadFilter withId(String id){
        return new ForumThreadFilter(id, authorUsername, title, content, category, authorDisplayName, createdAfter, createdBefore, includeDeleted);
    }

    public ForumThreadFilter withCategory(String category) {
        return new ForumThreadFilter(id, authorUsername, title, content, category, authorDisplayName, createdAfter, createdBefore, includeDeleted);
    }
}