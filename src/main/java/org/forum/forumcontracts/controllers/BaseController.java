package org.forum.forumcontracts.controllers;

import org.forum.forumcontracts.viewmodels.BaseViewModel;

public interface BaseController {
    BaseViewModel createBaseViewModel(String title);
}
