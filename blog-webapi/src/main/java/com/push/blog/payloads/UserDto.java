package com.push.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Setter
@Getter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4,max = 15,message ="Username must be of min 4 and max 15 characters")
	private String name;
	@Email(message = "Email is not in valid format")
	private String email;
	
	@NotEmpty
	@Size(min = 4,max = 15,message ="password must be of min 4 and max 15 characters")
	private String password;
	
	@NotEmpty
	@Size(max = 200)
	private String about;

}
