package org.forum.forumcontracts.controllers;

import jakarta.validation.Valid;
import org.forum.forumcontracts.input.UserRegistrationForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RequestMapping
public interface AuthController extends BaseController {
    @GetMapping("/login")
    String loginForm(Model model);

    @PostMapping("/login/error")
    String onFailedLogin(
            @ModelAttribute String emailOrUsername,
            RedirectAttributes redirectAttributes);

    @GetMapping("/register")
    String registrationForm(Model model);

    @PostMapping("/register")
    String register(@ModelAttribute @Valid UserRegistrationForm form, BindingResult bindingResult, Model model);
}
