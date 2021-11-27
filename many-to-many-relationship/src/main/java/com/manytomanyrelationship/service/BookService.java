package com.manytomanyrelationship.service;

import com.manytomanyrelationship.entity.Book;
import com.manytomanyrelationship.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService
{
    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBooks()
    {
        return  bookRepo.findAll();
    }
    public Book insertBook(Book book)
    {
        return bookRepo.save(book);
    }

}
