package com.bcprojekt.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bcprojekt.dao.UserDao;
import com.bcprojekt.model.UserModel;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(UserModel usr) {
		session.getCurrentSession().save(usr);		
	}

	@Override
	public void edit(UserModel usr) {
		session.getCurrentSession().update(usr);
	}

	@Override
	public void delete(int usrId) {
		session.getCurrentSession().delete(getUser(usrId));
	}

	@Override
	public UserModel getUser(int usrId) {
		return (UserModel)session.getCurrentSession().get(UserModel.class,usrId);
	}

	@Override
	public List getAllUsers() {
		return session.getCurrentSession().createQuery("from UserModel").list();
	}

}
