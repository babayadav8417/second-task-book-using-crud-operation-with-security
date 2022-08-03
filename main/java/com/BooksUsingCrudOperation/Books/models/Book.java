package com.BooksUsingCrudOperation.Books.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BookDetails")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String bookname;
    @Column(nullable = false)
    private String authorfirstname;
    @Column(nullable = false)
    private String authorlastname;
    @Column(nullable = false)
    private String adderess;
    @Column(nullable = false)
    private int price;
}
