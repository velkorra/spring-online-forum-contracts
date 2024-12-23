package org.forum.forumcontracts.controllers;

import jakarta.validation.Valid;
import org.forum.forumcontracts.input.NewThreadForm;
import org.forum.forumcontracts.input.ThreadEditForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/")
public interface ForumThreadController extends BaseController{
    @PostMapping("/thread/new")
    String createThread(@ModelAttribute @Valid NewThreadForm form, BindingResult bindingResult, Principal principal, Model model);

    @GetMapping("/thread/new")
    String newThread(Model model);

    @GetMapping("/thread/edit/{id}")
    String editThread(@PathVariable String id, Model model, Principal principal);

    @GetMapping("/thread/delete/{id}")
    String deleteThread(@PathVariable String id, Model model, Principal principal);

    @PostMapping("thread/edit/{id}")
    String editThreadForm(@PathVariable String id, @Valid ThreadEditForm form, BindingResult bindingResult, Model model, Principal principal);
}
