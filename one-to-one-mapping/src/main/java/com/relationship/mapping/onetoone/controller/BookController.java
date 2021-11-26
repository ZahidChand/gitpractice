package com.relationship.mapping.onetoone.controller;

import com.relationship.mapping.onetoone.entity.Book;
import com.relationship.mapping.onetoone.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController
{
    private final static Logger log = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book insertBook(@RequestBody Book book)
    {
        log.info("Book Insertd Successfully Into The Database.......");
        return bookService.addBook(book);
    }

    @GetMapping("/book")
    public List<Book> getAll()
    {
        log.info("Book Fetched Successfully From Database......");
        return bookService.getAllBooks();
    }

    @DeleteMapping("/book/{id}")
    public  String deleteBook(@PathVariable int id )
    {
        bookService.deleteBook(id);
        return "Successfully Deleted Book......";
    }


    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book)
    {
        log.info("Book Updated Successfully Into The Database........");
        return  bookService.updateBook(book);
    }





}
