/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcprojekt.controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Matt
 */
@Controller
public class SendController {


    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(value = "send" , method = RequestMethod.POST)
    
    public String doSendEmail(HttpServletRequest request) {

        

        String odbiorca = request.getParameter("odbiorca");
        String podmiot = request.getParameter("podmiot");
        String wiadomosc = request.getParameter("wiadomosc");

        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(odbiorca);
        email.setSubject(podmiot);
        email.setText(wiadomosc);

        
    mailSender.send(email);

        
    
    return "Result";
    }
}
