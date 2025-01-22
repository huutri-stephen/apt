package com.apt_corp.identity.mapper;

import org.mapstruct.Mapper;

import com.apt_corp.identity.dto.request.PermissionRequest;
import com.apt_corp.identity.dto.response.PermissionResponse;
import com.apt_corp.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
