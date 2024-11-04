package org.launchcode.codingevents.controllers;

import jakarta.validation.Valid;
import org.launchcode.codingevents.data.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.launchcode.codingevents.models.Person;


@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public String loginPage() {
        return "login/index";
    }

    @PostMapping
    public String successfulLogin(@ModelAttribute @Valid Person user, Errors errors) {
        if (errors.hasErrors()) {
            return "login";
        }

        return "login/my-events";
    }

    @GetMapping("my-events")
    public String userPage() {
        return "login/my-events";
    }

    @GetMapping("signup")
    public String signupPage(Model model) {
        model.addAttribute("title", "Create Account");
        model.addAttribute(new Person());
        return "login/signup";
    }

    @PostMapping("signup")
    public String addNewUser(@ModelAttribute @Valid Person newUser, Errors errors) {

        if (errors.hasErrors()) {
            return "login";
        }
        personRepository.save(newUser);
        return "redirect:/my-events";
    }

    @GetMapping("delete")
    public String obliterateAccount() {
        return "login/delete";
    }
}
