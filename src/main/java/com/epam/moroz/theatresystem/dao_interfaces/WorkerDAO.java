/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.moroz.theatresystem.dao_interfaces;

import com.epam.moroz.theatresystem.model.Position;
import com.epam.moroz.theatresystem.model.Worker;
import java.util.List;

/**
 *
 * @author Oksana_Moroz
 */
public interface WorkerDAO {

    Worker findByLoginPassword(String login, String password);
    
    List<Worker> findAll();
    
    Worker findById(Long id);
    
    List<Worker> findByPosition(Position position);
    
    List<Position> findAllPositions();
    
    void create(Worker worker);
    
    void update(Worker worker);
    
    void delete(Worker worker) throws Exception;
}
