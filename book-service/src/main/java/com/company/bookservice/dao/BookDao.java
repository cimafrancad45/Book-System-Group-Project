package com.company.bookservice.dao;

import com.company.bookservice.dto.Book;

import java.util.List;

public interface BookDao {
    Book getBook(int id);
    Book addBook(Book book);
    List<Book> getAllBooks();
    void updateBook(Book book);
    void deleteBook(int id);
}
