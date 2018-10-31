package com.fdmgroup.userregistrationsystem.write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import com.fdmgroup.userregistrationsystem.user.User;
import com.fdmgroup.userregistrationsystem.read.ReadCommand;

public class WriteCommand implements FileWriteCommand {

	public File file = new File("src" + File.separator + "main"
			  + File.separator + "resources" + File.separator + 
			  "UserDirectory.txt");

	public WriteCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public User writeUser(User user) {
		User returnUser = new User();
		BufferedWriter bw;
		
		String userString = user.getUsername() + " " + user.getPassword()
							+ " " + user.getRole() + "\n";
		
		try {
			file.getParentFile().mkdirs();
	        file.createNewFile();
	        
	    } catch (FileAlreadyExistsException ex) {
	        
	        System.err.println("File already exists");
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	try {	
			// check to see if user is already in the file
			ReadCommand read = new ReadCommand();
			User checkUser = read.readUser(user.getUsername());
			if(checkUser.getUsername() == null) {
			
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
