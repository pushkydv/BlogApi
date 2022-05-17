package com.push.blog.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.push.blog.entities.Comment;
import com.push.blog.entities.Post;
import com.push.blog.exceptions.ResourceNotFoundException;
import com.push.blog.payloads.CommentDto;
import com.push.blog.repositories.CommentRepo;
import com.push.blog.repositories.PostRepo;


@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private PostRepo postRepo;

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private ModelMapper modeMapper;

	@Override
	public CommentDto createComment(CommentDto commentDto, int postId) {

		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "Post ID", postId));
		Comment comment = this.modeMapper.map(commentDto, Comment.class);
		comment.setPost(post);
		Comment addedComment = this.commentRepo.save(comment);
		return this.modeMapper.map(addedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(int commentId) {
		Comment comment =this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "comment id", commentId));
		this.commentRepo.delete(comment);
		
		// TODO Auto-generated method stub

	}

}
