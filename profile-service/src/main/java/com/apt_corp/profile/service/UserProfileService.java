package com.apt_corp.profile.service;

import org.springframework.stereotype.Service;

import com.apt_corp.profile.dto.request.ProfileCreationRequest;
import com.apt_corp.profile.dto.response.UserProfileResponse;
import com.apt_corp.profile.entity.UserProfile;
import com.apt_corp.profile.mapper.UserProfileMapper;
import com.apt_corp.profile.repository.UserProfileRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserProfileService {
    UserProfileRepository userProfileRepository;
    UserProfileMapper userProfileMapper;

    public UserProfileResponse createProfile(ProfileCreationRequest request) {
        UserProfile userProfile = userProfileMapper.toUserProfile(request);
        userProfile = userProfileRepository.save(userProfile);
        return userProfileMapper.toUserProfileResponse(userProfile);
    }

    public UserProfileResponse getUserProfile(String profileId) {
        UserProfile userProfile =
                userProfileRepository.findById(profileId).orElseThrow(() -> new RuntimeException("Profile not found!"));
        return userProfileMapper.toUserProfileResponse(userProfile);
    }
}
