package com.login.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


@PostMapping(value = "/createuser")
    public String createUser() {
        return "app";
    }

}
