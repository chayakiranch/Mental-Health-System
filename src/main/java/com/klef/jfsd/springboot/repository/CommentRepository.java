package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.klef.jfsd.springboot.entity.Blogs;
import com.klef.jfsd.springboot.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Long>{

	
}
