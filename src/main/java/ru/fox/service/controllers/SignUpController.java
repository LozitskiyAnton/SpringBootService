package ru.fox.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.fox.service.forms.UserForm;
import ru.fox.service.services.SignUpService;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage()
    {
        return "signUp";
    }
    @PostMapping("/signUp")
      public String signUp(UserForm userForm){
        signUpService.signUp(userForm);
        return "redirect:/login";
}
}
