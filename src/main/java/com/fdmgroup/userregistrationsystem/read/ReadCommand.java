package com.fdmgroup.userregistrationsystem.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fdmgroup.userregistrationsystem.user.User;

public class ReadCommand implements FileReadCommand {

	public File file = new File("src" + File.separator + "main"
			  + File.separator + "resources" + File.separator + 
			  "UserDirectory.txt");
	
	public ReadCommand() {
		// TODO Auto-generated constructor stub
	}

	public User readUser(String username) {

		User returnUser = new User();
		BufferedReader br;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			
			while ((line = br.readLine()) != null) {
				if(line.startsWith(username)) {
					String[] splitLine = line.split(" ");
					returnUser.setUsername(splitLine[0]);
					returnUser.setPassword(splitLine[1]);
					returnUser.setRole(splitLine[2]);
				}
			}
			br.close();
			
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
