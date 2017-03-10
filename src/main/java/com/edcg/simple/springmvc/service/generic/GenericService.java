package com.edcg.simple.springmvc.service.generic;

import com.edcg.simple.springmvc.persistence.dao.generic.IGenericDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Edgar on 08/03/2017.
 */
public abstract class GenericService<E,K>  implements IGenericService<E,K> {

    @Autowired
    private IGenericDao<E,K> genericDao;


    @Override
    public E findOne(K id) {
        return genericDao.findOne(id);
    }

    @Override
    public List<E> findAll() {
        return genericDao.findAll();
    }

    @Override
    public E create(E entity) {
        return genericDao.create(entity);
    }

    @Override
    public E update(E entity) {
        return genericDao.update(entity);
    }

    @Override
    public void delete(E entity) {
        genericDao.delete(entity);
    }

    @Override
    public void deleteById(K entityId) {
        genericDao.deleteById(entityId);
    }


}
