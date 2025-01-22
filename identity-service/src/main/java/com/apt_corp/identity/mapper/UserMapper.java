package com.apt_corp.identity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.apt_corp.identity.dto.request.UserCreationRequest;
import com.apt_corp.identity.dto.request.UserUpdateRequest;
import com.apt_corp.identity.dto.response.UserResponse;
import com.apt_corp.identity.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
