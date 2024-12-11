package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.entity.Blogs;
import com.klef.jfsd.springboot.repository.*;



@Repository
public interface BlogsRepository extends JpaRepository<Blogs, Long>{
  List<Blogs> findByUsername(String username);
  List<Blogs> findByAuthorid(Long authorid);
}