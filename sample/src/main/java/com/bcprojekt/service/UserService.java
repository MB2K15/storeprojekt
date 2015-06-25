package com.bcprojekt.service;

import java.util.List;

import com.bcprojekt.model.UserModel;

public interface UserService {
	public void add(UserModel usr);
	public void edit(UserModel usr);
	public void delete(int usrId);
	public UserModel getUser(int usrId);
	public List getAllUsers();
}
