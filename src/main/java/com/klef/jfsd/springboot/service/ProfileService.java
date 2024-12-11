package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.entity.Profile;

public interface ProfileService {
    List<Profile> getAllProfiles();

    Profile getProfileById(Long id);
    List<Profile> getProfileByUsername(String username);

    Profile saveProfile(Profile profile);
    
}