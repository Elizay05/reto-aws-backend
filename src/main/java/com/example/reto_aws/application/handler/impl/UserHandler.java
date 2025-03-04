package com.example.reto_aws.application.handler.impl;

import com.example.reto_aws.application.dto.request.UserRequest;
import com.example.reto_aws.application.dto.response.UserResponse;
import com.example.reto_aws.application.handler.IUserHandler;
import com.example.reto_aws.application.mapper.IUserRequestMapper;
import com.example.reto_aws.application.mapper.IUserResponseMapper;
import com.example.reto_aws.domain.api.IUserServicePort;
import com.example.reto_aws.domain.model.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    private final IUserResponseMapper userResponseMapper;

    @Override
    public void saveUser(UserRequest userRequest) {
        userServicePort.saveUser(userRequestMapper.toUser(userRequest));
    }

    @Override
    public List<UserResponse> getAllUsers(){
        List<User> users = userServicePort.getAllUsers();
        return users.stream().map(userResponseMapper::toUserResponse).toList();
    }
}
