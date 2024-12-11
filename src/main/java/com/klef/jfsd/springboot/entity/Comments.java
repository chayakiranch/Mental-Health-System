package com.klef.jfsd.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="comments")
public class Comments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long blogid;
	private String comment;
	
	public Comments() {
		
	}
	
	public Comments(long blogid,String comment) {
		this.blogid = blogid;
		this.comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBlogid() {
		return blogid;
	}

	public void setBlogid(Long blogid) {
		this.blogid = blogid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
