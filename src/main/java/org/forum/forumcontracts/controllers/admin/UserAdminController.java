package org.forum.forumcontracts.controllers.admin;

import jakarta.validation.Valid;
import org.forum.forumcontracts.controllers.BaseController;
import org.forum.forumcontracts.filters.UserFilter;
import org.forum.forumcontracts.input.UserCreateForm;
import org.forum.forumcontracts.input.UserUpdateForm;
import org.springframework.ui.Model;
import org.springframework.data.domain.Pageable;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("admin/users")
public interface UserAdminController extends BaseController {
    @GetMapping
    String listUsers(Model model, @ModelAttribute UserFilter userFilter, Pageable pageable, Principal principal);

    @PostMapping
    String createUser(@ModelAttribute @Valid UserCreateForm userCreateForm, BindingResult bindingResult, Model model, Principal principal);

    @GetMapping("/create")
    String createUserForm(Model model, Principal principal);

    @PutMapping
    String updateUser(@ModelAttribute @Valid UserUpdateForm userUpdateForm, BindingResult bindingResult, Model model, Principal principal);

    @GetMapping("update/{id}")
    String updateUserForm(@PathVariable String id, Model model, Principal principal);

    @DeleteMapping("{id}")
    String deleteUser(@PathVariable String id, Model model, Principal principal);
}
