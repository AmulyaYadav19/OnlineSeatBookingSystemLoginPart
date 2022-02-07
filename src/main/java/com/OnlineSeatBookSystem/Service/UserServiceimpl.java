package com.OnlineSeatBookSystem.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineSeatBookSystem.Model.User;
import com.OnlineSeatBookSystem.Repository.UserRepository;


@Service
public class UserServiceimpl implements UserService
{


	@Autowired
	UserRepository repo;
	
	public User login(String username,String password)
	{
		User user=repo.findByUsernameAndPassword(username,password);
		return user;
	}
	
	public User addUser(User user)
	{
		User registration= repo.save(user);
		return user;
	}

	

	@Override
	public Optional<User> findByUserId(int userId) {
		// TODO Auto-generated method stub
		
		return repo.findByUserId(userId);
	}
		
		
		
			

	}
