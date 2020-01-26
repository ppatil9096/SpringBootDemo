package com.javahere.sboot.sbDemo.repository;

import com.javahere.sboot.sbDemo.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
