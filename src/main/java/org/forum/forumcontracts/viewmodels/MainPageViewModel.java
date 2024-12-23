package org.forum.forumcontracts.viewmodels;

import java.util.List;

public record MainPageViewModel(
        BaseViewModel base,
        List<ForumThreadWithCommentsViewModel> threads,
        List<CategoryViewModel> categories
) {
}
