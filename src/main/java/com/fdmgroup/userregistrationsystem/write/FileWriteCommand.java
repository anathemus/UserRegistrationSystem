package com.fdmgroup.userregistrationsystem.write;

import com.fdmgroup.userregistrationsystem.user.User;

public interface FileWriteCommand {
	public User writeUser(User user);
}
