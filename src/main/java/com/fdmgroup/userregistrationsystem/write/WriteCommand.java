package com.fdmgroup.userregistrationsystem.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.fdmgroup.userregistrationsystem.User;
import com.fdmgroup.userregistrationsystem.read.ReadCommand;

public class WriteCommand implements FileWriteCommand {

	public File file = new File("src/main/resources/UserDirectory.txt");
	
	public WriteCommand() {
		// TODO Auto-generated constructor stub
	}

	public User writeUser(User user) {
		User returnUser = new User();
		BufferedWriter bw;
		
		String userString = "\n" + user.getUsername() + " " + user.getPassword()
							+ " " + user.getRole();

	try {	
			// check to see if user is already in the file
			ReadCommand read = new ReadCommand();
			User checkUser = read.readUser(user.getUsername());
			if(checkUser == null) {
			
			  FileWriter fw = new FileWriter(file, true);
			  bw = new BufferedWriter(fw);
			  bw.write(userString);

			  bw.close();
			}
		} catch(SecurityException e) {
			System.out.println("Access Denied!!!");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnUser;
	
	}

}
