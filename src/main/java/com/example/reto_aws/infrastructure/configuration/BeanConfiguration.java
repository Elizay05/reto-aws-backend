package com.example.reto_aws.infrastructure.configuration;

import com.example.reto_aws.domain.api.IUserServicePort;
import com.example.reto_aws.domain.spi.IUserPersistencePort;
import com.example.reto_aws.domain.usecase.UserUseCase;
import com.example.reto_aws.infrastructure.output.jpa.adapter.UserJpaAdapter;
import com.example.reto_aws.infrastructure.output.jpa.mapper.IUserEntityMapper;
import com.example.reto_aws.infrastructure.output.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userEntityMapper, userRepository);
    }

    @Bean
    public IUserServicePort userServicePort() {
        return new UserUseCase(userPersistencePort());
    }
}
