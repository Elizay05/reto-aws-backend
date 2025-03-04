package com.example.reto_aws.application.handler;

import com.example.reto_aws.application.dto.request.UserRequest;
import com.example.reto_aws.application.dto.response.UserResponse;

import java.util.List;

public interface IUserHandler {
    void saveUser(UserRequest userRequest);
    List<UserResponse> getAllUsers();
}
