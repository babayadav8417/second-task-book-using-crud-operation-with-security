package com.BooksUsingCrudOperation.Books.Controllers;

import com.BooksUsingCrudOperation.Books.Service.BookService;
import com.BooksUsingCrudOperation.Books.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BooksController {
    @Autowired
    private BookService bookService;

    public BooksController(BookService bookService){
        this.bookService=bookService;
    }
    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return new ResponseEntity<Book>(bookService.saveBook(book), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBook();
    }
    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id")int id){
        return new ResponseEntity<Book>((Book) bookService.getBookById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id")int id,@RequestBody Book book){
        return new ResponseEntity<Book>(bookService.updateBook(book,id),HttpStatus.OK);
    }
    public ResponseEntity<String> deleteBook(@PathVariable("id")int id){
        bookService.deleteBook(id);
        return new ResponseEntity<String>("Book deleted successfully",HttpStatus.OK);
    }
}
