package com.edcg.simple.springmvc.service.impl;

import com.edcg.simple.springmvc.persistence.dao.IBookDao;
import com.edcg.simple.springmvc.persistence.model.Book;
import com.edcg.simple.springmvc.service.IBookService;
import com.edcg.simple.springmvc.service.generic.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Edgar on 08/03/2017.
 */

@Transactional
@Service
public class BookService extends GenericService<Book,Long> implements IBookService{

    @Autowired
    private IBookDao bookDao;

    @Override
    public List<Book> findAllByAuthor(String author) {
        return bookDao.findAllByAuthor(author);
    }
}
