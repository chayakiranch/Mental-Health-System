package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.springboot.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{
  Admin findByUsername(String username);
}