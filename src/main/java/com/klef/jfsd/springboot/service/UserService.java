package com.klef.jfsd.springboot.service;


import java.util.List;

import com.klef.jfsd.springboot.entity.Profile;
import com.klef.jfsd.springboot.entity.User;

public interface UserService {
    User registerUser(User user);
    User loginUser(String username, String password);
  List<User> fetchAllUsers();
  List<User> fetchUserById(Long id);
  void updateUser(Long id, User updatedUser);
  void deleteUser(Long id);
  void updateUserByProfile(Long id, Profile updatedProfile);
}