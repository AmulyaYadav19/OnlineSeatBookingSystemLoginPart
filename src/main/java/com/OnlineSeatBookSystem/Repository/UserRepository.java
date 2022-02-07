package com.OnlineSeatBookSystem.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.OnlineSeatBookSystem.Model.User;



public interface UserRepository extends JpaRepository<User, Integer>
{
	User findByUsernameAndPassword(String getuserName,String password);
	
	

	Optional<User> findByUserId(int userId);

	
}