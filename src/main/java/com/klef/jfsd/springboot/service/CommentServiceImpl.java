package com.klef.jfsd.springboot.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.entity.Comments;
import com.klef.jfsd.springboot.repository.CommentRepository;


@Service
public class CommentServiceImpl implements CommentsService{

	@Autowired
	private CommentRepository commentrepository;


	@Override
	public List<Comments> CommentsbyBlogId(Long blogid) {
		List<Comments> cm = commentrepository.findAll();
		List<Comments> com = new ArrayList<>();
		for(Comments c: cm) {
			if(c.getBlogid()==blogid) {
				com.add(c);
			}
		}
		return com;
	}


	@Override
	public void SaveComment(Comments comment) {
		commentrepository.save(comment);
		
	}




	@Override
	public  Comments updateComment(Comments comment) {
		Optional<Comments> o = commentrepository.findById(comment.getId());
		List<Comments> l = o.map(List::of).orElse(List.of());
		return l.get(0);
		
	}


	@Override
	public Void DeleteComment(Comments comment) {
		commentrepository.deleteById(comment.getId());
		return null;
		
	}
}
