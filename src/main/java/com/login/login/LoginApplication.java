package com.login.login;


import com.login.login.domain.User;
import com.login.login.domain.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class LoginApplication {



    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(UserRepository repository) {
//        return (args) -> {
//
//            repository.save(new User("aa", "aa"));
//            repository.save(new User("bb", "bb"));
//            repository.save(new User("cc", "cc"));
//            logger.info("User List:");
//            logger.info("-------------------------------");
//            for (User customer : repository.findAll()) {
//                logger.info(customer.toString());
//            }
//            logger.info("-------------------------------");
//
//        };
//    }

}
