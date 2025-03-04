package com.example.reto_aws.application.mapper;

import com.example.reto_aws.application.dto.response.UserResponse;
import com.example.reto_aws.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserResponseMapper {
    UserResponse toUserResponse(User user);
}
