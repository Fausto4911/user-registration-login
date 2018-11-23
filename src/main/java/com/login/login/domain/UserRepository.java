package com.login.login.domain;

import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByUsername(String userName);
}
