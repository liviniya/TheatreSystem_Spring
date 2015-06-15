/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.moroz.theatresystem.dao;

import com.epam.moroz.theatresystem.model.Performance;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Oksana_Moroz
 */
@Repository
public class DefaultDao {
    
    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public List<Performance> findAll() {
        TypedQuery<Performance> q = entityManager.createNamedQuery("Performance" + ".findAll", 
                Performance.class); 
        return q.getResultList(); 
    }
}
