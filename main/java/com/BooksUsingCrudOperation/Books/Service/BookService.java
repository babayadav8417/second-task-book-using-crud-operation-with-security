package com.BooksUsingCrudOperation.Books.Service;

import com.BooksUsingCrudOperation.Books.models.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);
    List<Book> getAllBook();

    List getAllBooks();

    Book getBookById(int id);
    Book updateBook(Book book, int id);
    void deleteBook(int id);

//    Book updateBook(Book book, int id);
}
