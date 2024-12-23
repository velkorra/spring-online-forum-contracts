package org.forum.forumcontracts.controllers;

import jakarta.validation.Valid;
import org.forum.forumcontracts.input.NewCommentForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@RequestMapping
public interface ThreadCommentController extends BaseController {
    @GetMapping("thread/comment/new/{id}")
    String commentCreateForm(@PathVariable String id, RedirectAttributes redirectAttributes);

    @PostMapping("thread/comment/new/{id}")
    String commentCreate(@PathVariable String id, @Valid @ModelAttribute("newCommentForm") NewCommentForm form, BindingResult bindingResult, Principal principal, RedirectAttributes redirectAttributes);

    @PostMapping("thread/comment/edit/{id}")
    String commentEdit(@PathVariable String id, @Valid @ModelAttribute("newCommentForm") NewCommentForm form, BindingResult bindingResult, Principal principal, RedirectAttributes redirectAttributes);

    @GetMapping("thread/comment/edit/{id}")
    String commentEditForm(@PathVariable String id, RedirectAttributes redirectAttributes, Principal principal);

    @GetMapping("thread/comment/delete/{id}")
    String commentDelete(@PathVariable String id, RedirectAttributes redirectAttributes, Principal principal);

}
