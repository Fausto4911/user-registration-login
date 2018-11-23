package com.login.login.controller;

import com.login.login.LoginApplication;
import com.login.login.domain.User;
import com.login.login.domain.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController implements Login {

    @Autowired
    private UserRepository repository;

    final static Logger logger = Logger.getLogger(LoginController.class);

    @GetMapping(value = "app")
    public String getApp(Model model) {

//        repository.save(new User("aa", "aa"));
//        repository.save(new User("bb", "bb"));
//        repository.save(new User("cc", "cc"));
//        logger.info("User List:");
//        logger.info("-------------------------------");
//        for (User customer : repository.findAll()) {
//            logger.info(customer.toString());
//        }
//        logger.info("-------------------------------");
        return "app";
    }

    @GetMapping(value = "login")
    public String getlogin(Model model) {
        return "login";
    }

    @GetMapping(value = "/")
    public String getIndex(Model model) {
        return "app";
    }


    @Override
    public boolean log(String usr, String pwd) {
        return false;
    }

    @Override
    public boolean unLog(String usr) {
        return false;
    }
}
