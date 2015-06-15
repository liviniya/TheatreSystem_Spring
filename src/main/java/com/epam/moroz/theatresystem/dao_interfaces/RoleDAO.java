/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.moroz.theatresystem.dao_interfaces;

import com.epam.moroz.theatresystem.model.Performance;
import com.epam.moroz.theatresystem.model.Role;
import java.util.List;

/**
 *
 * @author Oksana_Moroz
 */
public interface RoleDAO {

    void create(Role role);
    
    List<Role> findByPerformance(Performance performance);
    
    Role findById(Long id);
    
    List<Role> findAll();
    
    void delete(Role role) throws Exception;
}
