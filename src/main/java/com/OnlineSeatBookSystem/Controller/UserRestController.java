package com.OnlineSeatBookSystem.Controller;



import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineSeatBookSystem.Exception.RecordNotFoundException;
import com.OnlineSeatBookSystem.Model.User;
import com.OnlineSeatBookSystem.Service.UserService;



@RestController
public class UserRestController
{
	@Autowired
	UserService Service;
	
	@PostMapping("/user")
	public ResponseEntity<User> createProduct(@Validated @RequestBody User user)
	{
		System.out.println("Rest");
		User e= Service.addUser(user);
		System.out.println(e);
		//return  ResponseEntity.ok().body("Registration Successfully");
		return new ResponseEntity<User>(e,HttpStatus.OK);
	}
	
	
	@GetMapping("/user")
	public ResponseEntity createUser(@Validated @RequestBody User user)
	{
	User us=Service.login(user.getUsername(), user.getPassword());
	
	if(Objects.nonNull(us))
	{
		return ResponseEntity.ok().body("Login successfully");
	}
	else
	{
		return ResponseEntity.ok().body("Incorrect username or password");
		
	}
	
	}
	
	
@GetMapping("/user/{userId}")
public ResponseEntity<List<User>> getUserId(@PathVariable int userId) {
	Optional<User> user = Service.findByUserId(userId);

	if (user.isPresent()) {
		return new ResponseEntity(user.get(), HttpStatus.OK);
	} else {
		throw new RecordNotFoundException("Record not found...");
	}
}
}


		
		
	
	

	

