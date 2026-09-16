package com.eniyamart.eniya_mart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("email") String email,
            @RequestParam("password") String password) {

        // Temporary login validation
        if (email.equals("admin@gmail.com") && password.equals("1234")) {
            return "welcome";
        }

        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }
}