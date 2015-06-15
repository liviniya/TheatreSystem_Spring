/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.moroz.theatresystem.dao_interfaces;

import com.epam.moroz.theatresystem.model.Actor;
import com.epam.moroz.theatresystem.model.Contract;
import com.epam.moroz.theatresystem.model.Role;
import java.util.List;

/**
 *
 * @author Oksana_Moroz
 */
public interface ContractDAO {

    void create(Contract contract);    
    
    List<Actor> findByRole(Role role);
    
    List<Contract> findByRoleAll(Role role);
    
    List<Contract> findByRoleEndDate(Role role);
    
    List<Contract> findAll();
    
    Contract findById(Long id);
    
    List<Contract> findByEmptySalary();
    
    void update(Contract contract);
    
    void delete(Contract contract) throws Exception;
}
