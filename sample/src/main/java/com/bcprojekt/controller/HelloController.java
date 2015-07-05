/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.controller;



import com.bcprojekt.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Matt
 */
@Controller
public class HelloController {

    private static final String MY_LOGIN = "Mateusz";
    private static final String MY_PASSWORD = "abc";
    
    
    
    //Mapowanie dla strony domyslnej
    @RequestMapping(value = "/indeks")
    public String helloPage() {
        return "indeks";
    }

    
    //Mapowanie po wyslaniu formularza
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView welcome(@RequestParam(value = "username") String login,
                                @RequestParam(value = "password") String password) {
        ModelAndView model = new ModelAndView();

        
        //Tutaj sprawdzamy poprawnosc loginu i hasla
        if (checkLoginAndPassword(login, password)) {
            //Jesli poprawne stosowna wiadomosc
            model.addObject("message", "Strona powitalna!");
            model.setViewName("add");//view set
        } else {
            //Jesli nie poprawne wiadomosc
            model.addObject("message", "Login albo haslo niepoprawne");
            model.setViewName("wrongdata");
            
        }
        
        
        return model;
    }
    
   
    
    @RequestMapping(value = "/newp")
  public ModelAndView metodka(){
      
     
      ModelAndView model = new ModelAndView();
      model.addObject("person", new Person());
        return model;
      
      
     
    
  }
    
   @RequestMapping(value = "/save_person" , method =RequestMethod.POST)
    public String save (  Person person ){
        
        
        
        System.out.println(person.toString());
        
       return "info"; 
    }
    
 
    
    
    

    //Funkcja sprawdza poprawnosc loginu i hasla
    public boolean checkLoginAndPassword(String login, String password) {
        return MY_LOGIN.equals(login) && MY_PASSWORD.equals(password);
    }
    
}
