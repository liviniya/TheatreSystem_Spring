/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.moroz.theatresystem.service;

import com.epam.moroz.theatresystem.dao_interfaces.WorkerDAO;
import com.epam.moroz.theatresystem.model.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Oksana_Moroz
 */
@Service
@Transactional
public class LoginService {
    
    @Autowired
    private WorkerDAO workerDAO;
    
    public Worker findByLoginPassword(String login, String password) {
        return workerDAO.findByLoginPassword(login, password);
    }

    public WorkerDAO getWorkerDAO() {
        return workerDAO;
    }

    public void setWorkerDAO(WorkerDAO workerDAO) {
        this.workerDAO = workerDAO;
    }     
}