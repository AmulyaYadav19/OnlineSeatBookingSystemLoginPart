package com.OnlineSeatBookSystem.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.OnlineSeatBookSystem.Model.User;




@Service
public interface UserService {

	public User addUser(User user);
	public User login(String username,String password);
	
	public Optional<User> findByUserId(int userId);


}

