package com.example.reto_aws.domain.spi;

import com.example.reto_aws.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {
    User saveUser(User user);
    List<User> getAllUsers();
}
