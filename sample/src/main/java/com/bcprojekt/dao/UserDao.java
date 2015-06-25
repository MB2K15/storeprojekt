package com.bcprojekt.dao;

import java.util.List;

import com.bcprojekt.model.UserModel;

public interface UserDao {
	public void add(UserModel usr);
	public void edit(UserModel usr);
	public void delete(int usrId);
	public UserModel getUser(int usrId);
	public List getAllUsers();
}
