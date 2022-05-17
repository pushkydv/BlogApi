package com.push.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.push.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	

}
