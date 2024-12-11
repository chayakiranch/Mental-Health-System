package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.entity.Blogs;
import com.klef.jfsd.springboot.entity.Profile;

public interface BlogsService {
    
    Blogs saveBlogs(Blogs blog);

    List<Blogs> fetchAllBlogs();

    Blogs getBlogsById(Long authorid);

    List<Blogs> getBlogsByUsername(String username);

    Blogs updateBlogsByUsername(String Username, Blogs blog);

    String deleteBlogsById(Long authorid);

  void updateBlogsByProfile(String username, Profile updatedProfile);
}