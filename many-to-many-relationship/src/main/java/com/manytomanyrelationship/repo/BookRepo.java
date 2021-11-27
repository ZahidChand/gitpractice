package com.manytomanyrelationship.repo;

import com.manytomanyrelationship.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
}
