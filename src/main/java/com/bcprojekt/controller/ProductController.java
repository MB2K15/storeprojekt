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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Matt
 */
@Controller

public class ProductController {
    
   //private ProductDao productdao;
    
    @RequestMapping(value = "/add")
    public ModelAndView add (){
    
        
        
        ModelAndView model = new ModelAndView("/add");
        model.addObject("product", new Product());
       
        return model;
        
    }
    
    
    
    @RequestMapping(value = "/save" , method =RequestMethod.POST)
    public String save (Product product){
        
        
       //System.out.println(product.toString());
      
        
        
        
        return "info";
        
    }
    
    
    
    
    
    
    
}
