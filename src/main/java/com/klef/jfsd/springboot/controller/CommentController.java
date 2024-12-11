package com.klef.jfsd.springboot.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.klef.jfsd.springboot.service.BlogsService;
import com.klef.jfsd.springboot.service.CommentsService;
import com.klef.jfsd.springboot.entity.Blogs;
import com.klef.jfsd.springboot.entity.Comments;

@Controller
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentsService commentsService;
	
	@Autowired
	private BlogsService blogsService;
	
	@PostMapping("")
	public String blogComments(@RequestParam("authorid") Long autorid,Model model) {
		List<Comments> l = commentsService.CommentsbyBlogId(autorid);
		Blogs b = blogsService.getBlogsById(autorid);
		model.addAttribute("comments",l);
		model.addAttribute("blog",b);
		return "Blogcomment";
	} 
	
	@PostMapping("/createcomment")
	public String createCommet(@RequestParam("blogid") Long blogid,@RequestParam("comment") String comment) {
		Comments com = new Comments(blogid,comment);
		commentsService.SaveComment(com);
		return "redirect:/user/home";
	}
	
	
}
