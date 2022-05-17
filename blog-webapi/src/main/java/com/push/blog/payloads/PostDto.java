package com.push.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.push.blog.entities.Category;
import com.push.blog.entities.Comment;
import com.push.blog.entities.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class PostDto {
	
	private int postId;
	private String title ;
	private String content;
	private String imageName;
	private Date addedDate;	
	private CategoryDto category;
	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();
}
