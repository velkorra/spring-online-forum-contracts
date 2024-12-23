package org.forum.forumcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.forum.forumcontracts.controllers.BaseController;
import org.forum.forumcontracts.filters.ForumThreadFilter;
import org.forum.forumcontracts.input.ThreadCreateFrom;
import org.forum.forumcontracts.input.ThreadUpdateForm;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;


@RequestMapping("admin/threads")
public interface ThreadAdminController extends BaseController {
    @GetMapping
    String listThreads(@ModelAttribute ForumThreadFilter filter, Pageable pageable, Model model, Principal principal);

    @PostMapping
    String createThread(@ModelAttribute @Valid ThreadCreateFrom threadCreateFrom, BindingResult bindingResult, Model model, Principal principal);

    @GetMapping("create")
    String createThreadForm(Model model, Principal principal);

    @PutMapping
    String updateThread(@ModelAttribute @Valid ThreadUpdateForm form, BindingResult bindingResult, Model model, Principal principal);

    @GetMapping("update/{id}")
    String updateThreadForm(@PathVariable String id, Model model, Principal principal);

    @DeleteMapping
    String deleteThread(@RequestParam String id, Model model, Principal principal);
}
