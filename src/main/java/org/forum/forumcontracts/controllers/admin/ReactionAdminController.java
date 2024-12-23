package org.forum.forumcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.forum.forumcontracts.input.ReactionCreateForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin/reactions")
public interface ReactionAdminController {
    @GetMapping
    String listReactions(Model model);

    @PostMapping
    String addReaction(@ModelAttribute @Valid ReactionCreateForm reactionCreateForm, Model model);

    @DeleteMapping
    String deleteReaction(Model model);
}
