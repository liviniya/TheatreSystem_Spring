/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.moroz.theatresystem.service;

import com.epam.moroz.theatresystem.dao.DefaultDao;
import com.epam.moroz.theatresystem.model.Performance;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Oksana_Moroz
 */
@Service
public class DefaultService {
    
    @Autowired
    private DefaultDao defaultDao;
    
    public List<Performance> findAll() {
        return defaultDao.findAll();
    }

    public DefaultDao getDefaultDao() {
        return defaultDao;
    }

    public void setDefaultDao(DefaultDao defaultDao) {
        this.defaultDao = defaultDao;
    }    
}
