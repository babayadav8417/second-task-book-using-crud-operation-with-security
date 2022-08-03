package com.BooksUsingCrudOperation.Books.Repository;

import com.BooksUsingCrudOperation.Books.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
}
