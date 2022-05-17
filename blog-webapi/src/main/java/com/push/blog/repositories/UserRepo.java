package com.push.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.push.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}
