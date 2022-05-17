package com.push.blog.services;

import java.util.List;

import com.push.blog.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer id);
	UserDto getUserById(Integer id);
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer id);

}
