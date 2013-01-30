package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entity.User;

import service.UserService;

public class AddUserTest {
	private UserService us = new UserService();
	private User user = new User();
	
	@Test
	public void testUser(){
		user.setFirstName("testNameUser");
		user.setLastName("testLastNameUser");
		user.setEmail("testMail@test.mail");
		user.setPhoneNumber("123456789");
		user.setPassword("letmein");
		user.setUserName("someNeatUserNameWithoutNumbers");
		user.setProfilePicture(null);
		user.setRolId(new Integer(1));
		us.addUser(user);
		
		User testUser = us.getUserByEmail(user.getEmail());
		assertEquals(user,testUser);
	}

}
