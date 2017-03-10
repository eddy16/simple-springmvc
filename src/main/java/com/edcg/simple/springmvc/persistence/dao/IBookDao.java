package com.edcg.simple.springmvc.persistence.dao;

import com.edcg.simple.springmvc.persistence.dao.generic.IGenericDao;
import com.edcg.simple.springmvc.persistence.model.Book;

import java.util.List;

/**
 * Created by Edgar on 08/03/2017.
 */
public interface IBookDao extends IGenericDao<Book,Long> {

    List<Book> findAllByAuthor(String author);

}
