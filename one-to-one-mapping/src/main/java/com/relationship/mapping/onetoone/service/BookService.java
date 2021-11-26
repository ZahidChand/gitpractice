package com.relationship.mapping.onetoone.service;

import com.relationship.mapping.onetoone.entity.Book;
import com.relationship.mapping.onetoone.repo.BookRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService
{
    static final Logger log = LoggerFactory.getLogger(BookService.class);

    @Autowired
    private BookRepo bookRepo;

    public Book addBook(Book book)
    {
        return bookRepo.save(book);
    }

    public List<Book> getAllBooks()
    {
        return bookRepo.findAll();
    }
    public void deleteBook(int id)
    {
        log.info("Book Deleted Successfully.........");
        bookRepo.deleteById(id);
    }

    public  Book updateBook(Book book)
    {
        return  bookRepo.save(book);
    }
}
