package com.push.blog.services;

import java.util.List;

import com.push.blog.payloads.PostDto;
import com.push.blog.payloads.PostResponse;

public interface PostService {
	
	//Create
	PostDto createPost(PostDto postDto, int userId, int categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, int postId);
	
	//Delete
	void deletePost(int postId);
	
	//GetAll
	PostResponse getAllPosts(int pageNumber, int pageSize, String sortBy,String sortDir); 
	
	//Get Single Post
	PostDto getPostById(int postId);
	
	//Get all post in the category
	List<PostDto> getPostsByCategory(int categoryId);
	
	//Get all post by User
	List<PostDto> getPostsByUser(int userId);
	
	//Search
	List<PostDto> searchPost(String keyword);

}
