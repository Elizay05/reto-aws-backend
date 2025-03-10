package com.example.reto_aws.infrastructure.input.rest;

import com.example.reto_aws.application.dto.request.UserRequest;
import com.example.reto_aws.application.dto.response.UserResponse;
import com.example.reto_aws.application.handler.IUserHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserRestController {

    private final IUserHandler userHandler;

    @PostMapping()
    public ResponseEntity<String> saveUser(@Valid @RequestBody UserRequest userRequest) {
        userHandler.saveUser(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("User created");
    }

    @GetMapping()
    public ResponseEntity<List<UserResponse>> getAllUsers() {
        List<UserResponse> users = userHandler.getAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }
}