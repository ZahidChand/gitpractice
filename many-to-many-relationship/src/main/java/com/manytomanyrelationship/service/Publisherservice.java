package com.manytomanyrelationship.service;

import com.manytomanyrelationship.entity.Book;
import com.manytomanyrelationship.entity.Publisher;
import com.manytomanyrelationship.repo.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Publisherservice {
    @Autowired
    private PublisherRepo publisherRepo;

    public List<Publisher> getAllPublisher() {
        return publisherRepo.findAll();
    }

    public Publisher insertPublisher(Publisher publisher) {
        return publisherRepo.save(publisher);
    }


}
