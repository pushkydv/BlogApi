package com.push.blog.services;

import com.push.blog.payloads.CommentDto;

public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto, int postId);
	void deleteComment(int commentId);

}
