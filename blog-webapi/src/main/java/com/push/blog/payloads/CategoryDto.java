package com.push.blog.payloads;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private int categoryId;

	@NotEmpty
	@Size(min = 5, max = 30, message = "The title minmum length should be 5 characters and max should be 12")
	String categoryTitle;

	@NotEmpty
	@Size(min = 10, max = 200, message = "The title minmum length should be 10 characters and maximum 200")
	String categoryDescription;

}
