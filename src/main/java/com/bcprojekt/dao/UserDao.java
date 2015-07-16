package com.bcprojekt.dao;

import com.bcprojekt.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel, Integer> {

}
