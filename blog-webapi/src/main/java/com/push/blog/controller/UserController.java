package com.push.blog.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.push.blog.payloads.ApiResponse;
import com.push.blog.payloads.UserDto;
import com.push.blog.services.UserService;

@RestController
@RequestMapping("/blog")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		UserDto createdUser = this.userService.createUser(userDto);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);

	}

	@PutMapping("/users/{id}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable Integer id) {
		UserDto updatedUser = this.userService.updateUser(userDto, id);
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);

	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable int id) {
		this.userService.deleteUser(id);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully", true), HttpStatus.OK);

	}
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		List<UserDto> usersList=  this.userService.getAllUsers();		
		 return new ResponseEntity<>(usersList, HttpStatus.OK);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<UserDto> getUser(@RequestBody UserDto userDto, @PathVariable int id){
		UserDto user=  this.userService.getUserById(id);		
		 return new ResponseEntity<>(user, HttpStatus.OK);
	}

}
