package com.example.reto_aws.infrastructure.output.jpa.repository;

import com.example.reto_aws.infrastructure.output.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, String> {
}
