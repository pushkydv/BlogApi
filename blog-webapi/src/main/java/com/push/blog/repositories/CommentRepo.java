package com.push.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.push.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
	

}
