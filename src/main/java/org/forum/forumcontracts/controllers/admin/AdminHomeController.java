package org.forum.forumcontracts.controllers.admin;

import org.forum.forumcontracts.controllers.BaseController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
public interface AdminHomeController extends BaseController {
    @GetMapping
    String adminPanel(Model model);
}
