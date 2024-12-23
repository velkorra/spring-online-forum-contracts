package org.forum.forumcontracts.viewmodels;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public record FullUserViewModel(
        String id,
        String username,
        String email,
        String displayName,
        Date registeredOn,
        long threadCount,
        long commentCount,
        long reactionCount
) {
}
