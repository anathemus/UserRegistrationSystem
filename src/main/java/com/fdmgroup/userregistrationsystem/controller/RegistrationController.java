package com.fdmgroup.userregistrationsystem.controller;

import com.fdmgroup.userregistrationsystem.read.*;
import com.fdmgroup.userregistrationsystem.user.UserFactory;
import com.fdmgroup.userregistrationsystem.write.*;

public class RegistrationController {

	public ReadCommand read = new ReadCommand();
	public WriteCommand write = new WriteCommand();
	public UserFactory userFactory = new UserFactory();

}
