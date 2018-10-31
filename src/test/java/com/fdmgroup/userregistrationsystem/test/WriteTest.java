package com.fdmgroup.userregistrationsystem.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.userregistrationsystem.user.User;
import com.fdmgroup.userregistrationsystem.read.ReadCommand;
import com.fdmgroup.userregistrationsystem.write.WriteCommand;

public class WriteTest {

	User user;
	ArrayList<User> listUser;
	ReadCommand read;
	WriteCommand write;
	
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
		write = new WriteCommand();
	}


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFileWriteCommandByReadUserFromFileAfter() {
		user.setUsername("benjamin.burgess");
		user.setPassword("12345");
		user.setRole("Trainee");
		write.writeUser(user);
		User testUser = read.readUser("benjamin.burgess");
		System.out.println(testUser.getUsername());
		assertEquals(user.getUsername(), testUser.getUsername());
	}

}
