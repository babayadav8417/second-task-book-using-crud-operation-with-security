package com.BooksUsingCrudOperation.Books.Service;

import com.BooksUsingCrudOperation.Books.Repository.BookRepo;
import com.BooksUsingCrudOperation.Books.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo){
        this.bookRepo=bookRepo;
    }
    @Override
    public Book saveBook(Book book){
        return  bookRepo.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepo.findAll() ;
    }

    @Override
    public List getAllBooks()
    {
        return bookRepo.findAll();
    }
    @Override
    public Book getBookById(int id)
    {
        return bookRepo.findById(id).orElseThrow();
    }

//    @Override
//    public Book updateStudent(Book book, int id) {
//        return null;
//    }

    @Override
    public void deleteBook(int id) {
        bookRepo.findById(id).orElseThrow();
        bookRepo.deleteById(id);
    }

    @Override
    public Book updateBook(Book book, int id)
    {
        Book existingBook=bookRepo.findById(id).orElseThrow();
        existingBook.setBookname(book.getBookname());
        existingBook.setAuthorfirstname(book.getAuthorfirstname());
        existingBook.setAuthorlastname(book.getAuthorlastname());
        bookRepo.save(existingBook);
        return existingBook;
    }
}
