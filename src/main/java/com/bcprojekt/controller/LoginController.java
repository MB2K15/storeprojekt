/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.controller;


import com.bcprojekt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Matt
 */
@Controller
public class LoginController {

    @Autowired
    private UserDao userDao;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String helloPage() {
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView welcome(@RequestParam(value = "username") String login,
                                @RequestParam(value = "password") String password) {
        ModelAndView model = new ModelAndView();


        if (checkLoginAndPassword(login, password)) {
            model.addObject("message", "Strona powitalna!");
            model.setViewName("redirect:shopping");
        } else {
            model.addObject("message", "Login albo haslo niepoprawne");
            model.setViewName("wrongdata");

        }


        return model;
    }


    public boolean checkLoginAndPassword(String login, String password) {
        return userDao.findByUsrNameAndUsrPasswd(login, password) != null;
    }

}
