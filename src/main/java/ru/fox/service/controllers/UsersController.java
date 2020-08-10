package ru.fox.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.fox.service.repositories.UsersReposytory;

@Controller
public class UsersController {
    @Autowired
    private UsersReposytory usersReposytory;

    @GetMapping("/users")
    public String getUsersPage(ModelMap model) {
        model.addAttribute("usersFromServer", usersReposytory.findAll());
        return "users";
    }

}
