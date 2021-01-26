package com.hibernate.demo.service;

import com.hibernate.demo.entity.Book;
import com.hibernate.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list(){
        return bookRepository.findAll();
    }
}
