/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.controller;

import com.bcprojekt.dao.ProductDao;
import com.bcprojekt.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;

/**
 * @author Matt
 */
@Controller
public class CartController {

    @Autowired
    private ProductDao productDao;


    @RequestMapping(value = "/form")
    public String index(ModelMap m) {
        m.put("product", new Product());
        return "form";
    }
    
    @RequestMapping(value = "/upcart")
    public String upcart(){
    
    return "upcart";
    }
    
    @RequestMapping(value="/Order")
    public String result(){
        
        
        return "Order";
    }
    
    @RequestMapping(value = "/addtocart", method = RequestMethod.POST)
    
    public String addToCart(@RequestParam(value = "productId") Integer productId, HttpSession session) {
        List<Product> lista = (List<Product>) session.getAttribute("lista");
        if (lista == null) {
            lista = new ArrayList<>();
            session.setAttribute("lista",lista);
        }
        Product product = productDao.findOne(productId);
        lista.add(product);
        session.setAttribute("wszystko", getAll(lista));
        return "upcart";
    }


    @RequestMapping(value = "/addcart", method = RequestMethod.POST)
    public String addcart(@ModelAttribute("product") Product p, HttpSession session) {
        List<Product> lista = (List<Product>) session.getAttribute("product");
        if (lista == null) {
            lista = getAllProducts();
            session.setAttribute("product", lista);
        }
        
        productDao.save(p);
        lista.add(p);
        session.setAttribute("wszystko", getAll(lista));
        return "product";
    }
    //Object o;
   

//get i post
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "productId") Integer productId, HttpSession session) {
        List<Product> lista = (List<Product>) session.getAttribute("product");
        if (lista != null) {
            Iterator<Product> iterator = lista.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (Objects.equals(product.getId(), productId)) {
                    iterator.remove();
                    productDao.delete(productId);
                    break;
                }
            }
        }
        session.setAttribute("product", lista);
        session.setAttribute("wszystko", getAll(lista));
        return "product";
    }

    public float getAll(List<Product> lista) {
        float wszystko = 0;
        for (Product product : lista) {
            wszystko += (product.getNumber() * product.getPrice());
        }
        return wszystko;
    }


    private List<Product> getAllProducts() {
        List<Product> result = new ArrayList<>();
        Iterator<Product> all = productDao.findAll().iterator();
        while (all.hasNext()) {
            result.add(all.next());
        }
        return result;
    }

}
