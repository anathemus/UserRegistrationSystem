package com.fdmgroup.userregistrationsystem.read;

import com.fdmgroup.userregistrationsystem.User;

public interface FileReadCommand {
	public User readUser(String username);
}
