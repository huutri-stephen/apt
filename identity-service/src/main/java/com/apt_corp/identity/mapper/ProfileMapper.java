package com.apt_corp.identity.mapper;

import com.apt_corp.identity.dto.request.ProfileCreationRequest;
import com.apt_corp.identity.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
