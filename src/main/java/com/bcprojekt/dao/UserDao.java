package com.bcprojekt.dao;

import com.bcprojekt.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel, Integer> {

    UserModel findByUsrNameAndUsrPasswd(String name, String password);
}
