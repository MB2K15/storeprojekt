/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.controller;

import com.bcprojekt.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Matt
 */
@Controller
@RequestMapping(value = "/scart")
public class CartController {
    
    @RequestMapping(value = "/form")
    public String index (ModelMap m ){
        
        m.put("product", new Product());
        return "form";
        
    }
    //
    @RequestMapping(value = "/addcart" , method = RequestMethod.POST)
    public String addcart (@ModelAttribute("product")Product p , HttpSession session){
        
      List <Product> lista = (List <Product>)session.getAttribute("product");
     
     if (lista == null){
      
         lista = new ArrayList<>();
         lista.add(p);
         
     }
     
     else{
         
         boolean flaga = false;
         
         for(Product product : lista){
             
             if(product.getName() == p.getName())
             
             {
             
                 
             product.setNumber((short) (product.getNumber()+1));
             flaga = true;
             break;
             
             }
             
             if (flaga == false)
                 
                 lista.add(p);
             
             
             
         }
         
         
     }

    
    
    session.setAttribute("product", lista);
    session.setAttribute("wszystko", getAll(lista));
    
    return "product";
    }
    
    public float getAll( List <Product> lista){
        float wszystko = 0;
        
        for (Product product : lista) {
            
            wszystko += (product.getNumber() * product.getPrice());
            
            
        }
        
        
        
        return wszystko;
    }
    
    
}
