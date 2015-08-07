package com.bcprojekt.controller;

import com.bcprojekt.dao.UserDao;
import com.bcprojekt.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Piotr on 2015-08-07.
 */
@Controller
public class MainController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/index")
    public String setupForm(ModelMap map) {
        map.put("usr", new UserModel());
        return "user";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String doActions(@ModelAttribute UserModel usr) {
        userDao.save(usr);
        return "login";
    }
}
