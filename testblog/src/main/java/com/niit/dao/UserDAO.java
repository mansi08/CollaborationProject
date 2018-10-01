package com.niit.dao;

import com.niit.model.User;

public interface UserDAO  
{
	void registration(User user);
	boolean isEmailUnique(String email);
	 User login(User user);
	void updateUser(User user);
	User getUser(String email);

}
