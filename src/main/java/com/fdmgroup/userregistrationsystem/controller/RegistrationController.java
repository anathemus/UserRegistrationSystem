package com.fdmgroup.userregistrationsystem.controller;

import com.fdmgroup.userregistrationsystem.read.*;
import com.fdmgroup.userregistrationsystem.user.User;
import com.fdmgroup.userregistrationsystem.user.UserFactory;
import com.fdmgroup.userregistrationsystem.write.*;

public class RegistrationController {

	public ReadCommand read = new ReadCommand();
	public WriteCommand write = new WriteCommand();
	public UserFactory userFactory = new UserFactory();
	User registerUser;
	
	public void registerNewUser(String username, String password,
				String role) {
		registerUser = userFactory.UserFactory();
		registerUser.setUsername(username);
		registerUser.setPassword(password);
		registerUser.setRole(role);

		write.writeUser(registerUser);
	}

}
