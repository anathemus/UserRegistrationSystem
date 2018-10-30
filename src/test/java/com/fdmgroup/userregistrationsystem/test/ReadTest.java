package com.fdmgroup.userregistrationsystem.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.fdmgroup.userregistrationsystem.User;
import com.fdmgroup.userregistrationsystem.read.ReadCommand;

public class ReadTest {

	User user;
	ArrayList<User> listUser;
	ReadCommand read;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		user = new User();
		listUser = new ArrayList<User>();
		read = new ReadCommand();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUsername() {
		user.setUsername("benjamin.burgess");
		assertEquals("benjamin.burgess", user.getUsername());
	}
	
	@Test
	public void testGetPassword() {
		user.setPassword("12345");
		assertEquals("12345", user.getPassword());
	}
	
	@Test
	public void testGetRole() {
		user.setRole("Trainee");
		assertEquals("Trainee", user.getRole());
	}
	
	@Test
	public void testFileReadCommand() {
		user.setUsername("benjamin.burgess");
		user.setPassword("12345");
		user.setRole("Trainee");
		listUser.add(user);
		User testUser = read.readUser("benjamin.burgess");
		assertEquals(user.getUsername(), testUser.getUsername());
	}
	
}
