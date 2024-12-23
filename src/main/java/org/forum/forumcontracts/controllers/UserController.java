package org.forum.forumcontracts.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@RequestMapping
public interface UserController extends BaseController {
    @GetMapping("/me")
    String UserProfile(Model model, Principal principal);
}
