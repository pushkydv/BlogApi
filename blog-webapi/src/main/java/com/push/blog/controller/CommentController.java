package com.push.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.push.blog.payloads.ApiResponse;
import com.push.blog.payloads.CommentDto;
import com.push.blog.services.CommentService;

@Controller
@RequestMapping("/blog/")
public class CommentController {
	
	
	@Autowired
	private CommentService commentService;
	
	@PostMapping("/posts/{postId}/comments")
	public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable int postId) {

		CommentDto addedComment = commentService.createComment(commentDto, postId);

		return new ResponseEntity<CommentDto>(addedComment, HttpStatus.CREATED);

	}
	
	@DeleteMapping("/comments/{commentId}")
	public ResponseEntity<ApiResponse> deleteComment(@PathVariable int commentId){
		
		this.commentService.deleteComment(commentId);
		
		return new ResponseEntity<ApiResponse>(new ApiResponse("Deleted comment succesfully", true), HttpStatus.OK);
		
		
	}

	
	
}
