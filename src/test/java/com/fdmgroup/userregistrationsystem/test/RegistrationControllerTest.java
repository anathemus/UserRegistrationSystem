package com.fdmgroup.userregistrationsystem.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.userregistrationsystem.controller.RegistrationController;
import com.fdmgroup.userregistrationsystem.user.User;

public class RegistrationControllerTest {

	RegistrationController controller;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		controller = new RegistrationController();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testControllerReadCommand() {
		assertEquals(controller.read.readUser("benjamin.burgess").getUsername(), "benjamin.burgess");
	}
	
	@Test
	public void testControllerWriteCommand() {
		User testUser = new User();
		testUser.setUsername("benjamin.burgess");
		testUser.setPassword("12345");
		testUser.setRole("Trainee");
		controller.write.writeUser(testUser);
		assertEquals(controller.read.readUser("benjamin.burgess").getUsername(), "benjamin.burgess");
	}
	
	@Test
	public void testRegisterNewUser() {
		fail("Not yet implemented");
	}

}
