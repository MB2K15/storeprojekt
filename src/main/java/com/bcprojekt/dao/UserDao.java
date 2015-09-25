package com.bcprojekt.dao;

import com.bcprojekt.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel, Integer> {

    //method no need implementation and working
    UserModel findByUsrNameAndUsrPasswd(String name, String password);
}
