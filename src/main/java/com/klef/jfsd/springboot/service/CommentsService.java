package com.klef.jfsd.springboot.service;
import java.util.*;

import com.klef.jfsd.springboot.entity.Comments;
public interface CommentsService {
	
	List<Comments> CommentsbyBlogId(Long blogid);
	void SaveComment(Comments comment);
	Comments updateComment(Comments comment);
	Void DeleteComment(Comments comment);

}
