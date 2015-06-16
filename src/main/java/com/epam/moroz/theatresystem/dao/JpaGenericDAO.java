/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.moroz.theatresystem.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Oksana_Moroz
 */
public class JpaGenericDAO<T> {
    
    @PersistenceContext
    protected EntityManager em;

    private final Class<T> entityClass;

    public JpaGenericDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void create(T entity) {
        em.persist(entity);
    }

    public T findById(Long id) {
        return em.find(entityClass, id);
    }

    public List<T> findAll() {
        TypedQuery<T> q = em.createNamedQuery(entityClass.getSimpleName() + ".findAll",
                entityClass);
        return q.getResultList();
    }

    public void update(T entity) {
        em.merge(entity);
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }
    
    public void delete(T entity) throws Exception{
        entity = em.merge(entity);
        em.remove(entity);
    }
    
    public EntityManager getEntityManager() {
        return em;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.em = entityManager;
    }    
}
