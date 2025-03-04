package com.example.reto_aws.infrastructure.output.jpa.adapter;

import com.example.reto_aws.domain.model.User;
import com.example.reto_aws.domain.spi.IUserPersistencePort;
import com.example.reto_aws.infrastructure.output.jpa.mapper.IUserEntityMapper;
import com.example.reto_aws.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserEntityMapper userEntityMapper;
    private final IUserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userEntityMapper.toUser(userRepository.save(userEntityMapper.toUserEntity(user)));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll().stream().map(userEntityMapper::toUser).toList();
    }
}
