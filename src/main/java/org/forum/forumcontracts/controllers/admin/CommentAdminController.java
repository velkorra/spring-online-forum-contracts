package org.forum.forumcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.forum.forumcontracts.controllers.BaseController;
import org.forum.forumcontracts.filters.ThreadCommentFilter;
import org.forum.forumcontracts.input.ThreadCommentCreateForm;
import org.forum.forumcontracts.input.ThreadCommentUpdateForm;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("admin/comments")
public interface CommentAdminController extends BaseController {
    @GetMapping
    String listComments(@ModelAttribute ThreadCommentFilter filter, Pageable pageable, Model model, Principal principal);

    @PostMapping
    String createComment(@ModelAttribute @Valid ThreadCommentCreateForm threadCommentCreateForm, BindingResult bindingResult, Model model, Principal principal);

    @GetMapping("create")
    String createCommentForm(Model model, Principal principal);

    @PutMapping
    String updateComment(@ModelAttribute @Valid ThreadCommentUpdateForm threadCommentUpdateForm, BindingResult bindingResult, Model model, Principal principal);

    @GetMapping("update/{id}")
    String updateCommentForm(@PathVariable String id, Model model, Principal principal);

    @DeleteMapping("{id}")
    String deleteComment(@PathVariable String id, Model model, Principal principal);
}
