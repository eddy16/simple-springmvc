package com.edcg.simple.springmvc.persistence.model;

import com.edcg.simple.springmvc.persistence.model.generic.GenericModel;

import javax.persistence.*;

/**
 * Created by Edgar on 08/03/2017.
 */

@Entity
@Table(name = "book")
@NamedQueries({
        @NamedQuery(name = "findAllByAuthor", query = "from Book b where b.author = :author")
})
public class Book extends GenericModel<Book>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
