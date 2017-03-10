package com.edcg.simple.springmvc.persistence.dao.generic;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Edgar on 08/03/2017.
 */
public abstract class GenericDao<E extends Serializable, K extends Serializable> implements IGenericDao<E,K>{

    private Class<E> clazz;

    @PersistenceContext
    private EntityManager entityManager;

    public final void setClazz(final Class<E> clazzToSet) {
        this.clazz = clazzToSet;
    }

    @Override
    public E findOne(K id) {
        return entityManager.find(clazz, id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    @SuppressWarnings("unchecked")
    public List<E> findAll() {
        return (List<E>) entityManager.createQuery("from " + clazz.getName()).getResultList();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public E create(E entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public E update(E entity) {
        return entityManager.merge(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(E entity) {
        entityManager.remove(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(K entityId) {
        E entity = findOne(entityId);
        delete(entity);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
