/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.moroz.theatresystem.controllers;

import com.epam.moroz.theatresystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Oksana_Moroz
 */
@Controller
public class LoginController {
    
    @Autowired
    private LoginService loginService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }
    
    @RequestMapping(value = "/next_page", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam String login, @RequestParam String password) {
        System.out.println("login = " + login);
        System.out.println("password = " + password);
        
        ModelAndView mav = new ModelAndView("next_page");
        mav.addObject("login", login);
        mav.addObject("password", password);
        
        return mav;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }    
}
