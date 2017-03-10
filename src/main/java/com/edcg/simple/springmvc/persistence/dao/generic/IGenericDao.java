package com.edcg.simple.springmvc.persistence.dao.generic;

import java.util.List;

/**
 * Created by Edgar on 09/03/2017.
 */
public interface IGenericDao <E,K> {

    E findOne(final K id);

    List<E> findAll();

    E create(final E entity);

    E update(final E entity);

    void delete(final E entity);

    void deleteById(final K id);

}
