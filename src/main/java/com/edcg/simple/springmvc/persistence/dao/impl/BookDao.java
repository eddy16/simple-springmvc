package com.edcg.simple.springmvc.persistence.dao.impl;

import com.edcg.simple.springmvc.persistence.dao.IBookDao;
import com.edcg.simple.springmvc.persistence.dao.generic.GenericDao;
import com.edcg.simple.springmvc.persistence.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Edgar on 08/03/2017.
 */

@Repository
public class BookDao extends GenericDao<Book, Long> implements IBookDao {


    public BookDao() {
        super();
        setClazz(Book.class);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> findAllByAuthor(String author) {
        return getEntityManager()
                .createNamedQuery("findAllByAuthor")
                .getResultList();
    }
}
