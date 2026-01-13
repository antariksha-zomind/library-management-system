package com.example.repository;

import com.example.model.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

  private List<Book> books;

  public BookRepository() {
    books = new ArrayList<>();

    Book book1 = Book.builder()
        .id(1)
        .name("Harry Potter")
        .author("J. K. Rowling")
        .price(40.0)
        .build();


    Book book2 = Book.builder()
        .id(1)
        .name("The Cuckoo's calling")
        .author("J. K. Rowling")
        .price(40.0)
        .build();

    books.add(book1);
    books.add(book2);
  }

  public List<Book> getBooks() {
    return books;
  }

}
