/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.moroz.theatresystem.controllers;

import com.epam.moroz.theatresystem.service.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Oksana_Moroz
 */
@Controller
public class DefaultController {

    @Autowired
    private DefaultService defaultService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");        
        mav.addObject("performances", defaultService.findAll());
        return mav;
    }
    
    public DefaultService getDefaultService() {
        return defaultService;
    }

    public void setDefaultService(DefaultService defaultService) {
        this.defaultService = defaultService;
    }
    
}
