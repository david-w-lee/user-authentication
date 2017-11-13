package com.davidwlee.user_authentication;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.davidwlee.controller.UserController;
import com.davidwlee.model.User;
import com.davidwlee.repository.UserRepository;

public class UserControllerTest {
	@InjectMocks
	private UserController uc;
	
	@Mock
	private UserRepository userRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testUserGet() {
		User u = new User();
		u.setUserId(1l);
		when(userRepository.findOne(1l)).thenReturn(u);
		
		User user = uc.get(1L);
		assertThat(user.getUserId(), is(1l));
	}
}
