package com.apt_corp.profile.mapper;

import org.mapstruct.Mapper;

import com.apt_corp.profile.dto.request.ProfileCreationRequest;
import com.apt_corp.profile.dto.response.UserProfileResponse;
import com.apt_corp.profile.entity.UserProfile;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);
    UserProfileResponse toUserProfileResponse(UserProfile entity);
}
