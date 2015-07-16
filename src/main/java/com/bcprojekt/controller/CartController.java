/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.controller;

import com.bcprojekt.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Matt
 */
@Controller
public class CartController {

    @RequestMapping(value = "/form")
    public String index(ModelMap m) {

        m.put("product", new Product());
        return "form";

    }
    //


    @RequestMapping(value = "/addcart", method = RequestMethod.POST)
    public String addcart(@ModelAttribute("product") Product p, HttpSession session) {
        List<Product> lista = (List<Product>) session.getAttribute("product");

        if (lista == null) {
            lista = new ArrayList<>();
            session.setAttribute("product",lista);
        }
        lista.add(p);
        session.setAttribute("wszystko", getAll(lista));
        return "product";
    }
    
     @RequestMapping(value = "/remove", method = RequestMethod.GET)
     public String remove(@RequestParam(value="name") String name , HttpSession session){
          List<Product> lista = (List<Product>) session.getAttribute("product");
          
         if(lista !=null){
             
             for(Product product : lista) {
                
                 if(product.getName() == name){
                     
                     
                     lista.remove(product);
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
    
    

}
