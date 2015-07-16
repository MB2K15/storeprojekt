/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Matt
 */
@Controller
@RequestMapping(value = "/sendmail")
public class SendController {
    
    

     @Autowired
    private JavaMailSender mailSender;
     
    @RequestMapping( method = RequestMethod.POST)
    public String doSendEmail(HttpServletRequest request) {
        
        
        // pobiera dane wjsciowe z formularza email
        String odbiorca = request.getParameter("odbiorca");
        String podmiot = request.getParameter("podmiot");
        String wiadomosc = request.getParameter("wiadomosc");
         
       
         
        // tworzenie obiektu  email
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(odbiorca);
        email.setSubject(podmiot);
        email.setText(wiadomosc);
         
        // wysy³a mail
        mailSender.send(email);
         
     
        return "Result";
    }
    
    
    
    
    
}
