package com.edcg.simple.springmvc.service;

import com.edcg.simple.springmvc.persistence.model.Book;

import java.util.List;

/**
 * Created by Edgar on 08/03/2017.
 */
public interface IBookService {

    List<Book> findAllByAuthor(String author);

}
