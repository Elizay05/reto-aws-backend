package com.example.reto_aws.domain.api;

import com.example.reto_aws.domain.model.User;

import java.util.List;

public interface IUserServicePort {
    User saveUser(User user);
    List<User> getAllUsers();
}
