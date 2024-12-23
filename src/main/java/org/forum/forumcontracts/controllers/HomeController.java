package org.forum.forumcontracts.controllers;

import jakarta.validation.Valid;
import org.forum.forumcontracts.input.NewThreadForm;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/")
public interface HomeController extends BaseController {
    @GetMapping
    String homeWithoutCategory(Model model, Pageable pageable, Principal principal);

    @GetMapping("/{category}")
    String homeWithCategory(Model model, Pageable pageable, @PathVariable String category, Principal principal);

    @GetMapping("thread/topByLike")
    String getTopLike(Model model, Principal principal);
}
