package ru.fox.service.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.fox.service.security.details.UserDetailsImpl;
import ru.fox.service.transfer.UserDto;

import static ru.fox.service.transfer.UserDto.from;

@Controller
public class ProfileController {
@GetMapping("/profile")
public String getProfilePage(ModelMap modelMap,Authentication authentication){
    if(authentication==null) return "redirect:/login";
    UserDetailsImpl details = (UserDetailsImpl) authentication.getPrincipal();
    UserDto user = from(details.getUser());
    modelMap.addAttribute("user", user);
    return "profile";
}

}
