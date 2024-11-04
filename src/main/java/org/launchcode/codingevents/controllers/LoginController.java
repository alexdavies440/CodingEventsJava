package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {

    @GetMapping
    public String loginPage() {
        return "login/index";
    }

    @GetMapping("signup")
    public String signupPage() {
        return "login/signup";
    }

    @GetMapping("delete")
    public String obliterateAccount() {
        return "login/delete";
    }
}
