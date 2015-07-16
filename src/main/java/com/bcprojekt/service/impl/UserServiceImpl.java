package com.bcprojekt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bcprojekt.dao.UserDao;
import com.bcprojekt.model.UserModel;
import com.bcprojekt.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao usrDao;
	@Transactional
	public void add(UserModel usr) {
		usrDao.save(usr);
	}

	@Transactional
	public void edit(UserModel usr) {
		usrDao.save(usr);
	}

	@Transactional
	public void delete(int usrId) {
		usrDao.delete(usrId);
	}

	@Transactional
	public UserModel getUser(int usrId) {
		return usrDao.findOne(usrId);
	}

	@Transactional
	public Iterable<UserModel> getAllUsers() {
		return usrDao.findAll();
	}

}
