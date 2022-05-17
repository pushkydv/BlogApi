package com.push.blog.services;

import java.util.List;

import com.push.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//Create
	CategoryDto createCategory(CategoryDto categoryDto);
	//Update
	CategoryDto updateCategory(CategoryDto categoryDto, int categoryId);	
	//GetCategory
	CategoryDto getCategory(int categoryId);
	//GetAllCategories
	List<CategoryDto> getAllCategory();	
	//Delete
	void deleteCategory(int categoryId);

}
