/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.controller;


import com.bcprojekt.dao.ProductDao;
import com.bcprojekt.dao.UserDao;
import com.bcprojekt.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matt
 */
@Controller
public class LoginController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String helloPage() {
        return "login";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcome(@RequestParam(value = "username") String login,
                          @RequestParam(value = "password") String password,
                          HttpSession session) {
        if (checkLoginAndPassword(login, password)) {
            List<Product> allProducts = getAllProducts();
            session.setAttribute("allproducts", allProducts);
            return "shopping";
        } else {
            return "index";
        }
    }


    private List<Product> getAllProducts() {
        Iterable<Product> all = productDao.findAll();
        List<Product> products = new ArrayList<Product>();
        for (Product p : all) {
            products.add(p);
        }
        return products;
    }

    public boolean checkLoginAndPassword(String login, String password) {
        return userDao.findByUsrNameAndUsrPasswd(login, password) != null;
    }

}
