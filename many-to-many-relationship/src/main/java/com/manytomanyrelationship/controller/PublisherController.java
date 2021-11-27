package com.manytomanyrelationship.controller;

import com.manytomanyrelationship.entity.Publisher;
import com.manytomanyrelationship.service.Publisherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublisherController
{
    @Autowired
    private Publisherservice publisherservice;

    @GetMapping("/publisher")
    public List<Publisher> getAllPublisher()
    {
        return publisherservice.getAllPublisher();
    }
    @PostMapping("/publisher")
    public Publisher addPublisher(@RequestBody Publisher publisher)
    {
        return publisherservice.insertPublisher(publisher);
    }



}
