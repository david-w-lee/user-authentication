package com.davidwlee.user_authentication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.davidwlee.model.User;
import com.davidwlee.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class UserRepositoryIntegrationTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void test() {
		User user = userRepository.findOne(1L);
		assertThat(user.getFirstName(), is("john"));
	}
}
