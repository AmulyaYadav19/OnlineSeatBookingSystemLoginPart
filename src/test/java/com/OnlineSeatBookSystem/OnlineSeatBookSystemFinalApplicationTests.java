package com.OnlineSeatBookSystem;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.OnlineSeatBookSystem.Model.User;
import com.OnlineSeatBookSystem.Repository.UserRepository;
import com.OnlineSeatBookSystem.Service.UserService;



@SpringBootTest
class OnlineSeatBookSystemFinalApplicationTests {

	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class OnlineSeatBookApplicationTests {

		@Autowired
		
		private UserService service;
		
		@MockBean
		
		 private UserRepository repository;
		
		@Test
		public void saveUserTest() {
			User userId=null;
			User user =new User(1, "amulyaumesh19","ammuyadav", "amulya", "umesh", "shimoga", "9887876543");
			when(repository.save(user)).thenReturn(user);
			assertEquals(user,service.addUser(user));
		}
	}
	}
		
		