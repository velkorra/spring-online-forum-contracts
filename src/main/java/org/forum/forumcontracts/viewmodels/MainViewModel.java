package org.forum.forumcontracts.viewmodels;

import java.util.List;

public record MainViewModel(
        BaseViewModel baseViewModel,
        List<ForumThreadViewModel> threadViewModels
) {
}
