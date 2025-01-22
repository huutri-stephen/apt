package com.apt_corp.identity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.apt_corp.identity.dto.request.RoleRequest;
import com.apt_corp.identity.dto.response.RoleResponse;
import com.apt_corp.identity.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
