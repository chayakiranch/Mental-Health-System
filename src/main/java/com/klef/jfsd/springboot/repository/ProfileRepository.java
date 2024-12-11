package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.springboot.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

  List<Profile> findByUsername(String username);
    // You can add custom query methods here if needed
}