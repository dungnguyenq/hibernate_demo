package com.hibernate.demo;

import com.hibernate.demo.entity.Book;
import com.hibernate.demo.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private BookService bookService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords(){
        List<Book> books = bookService.list();

        Assertions.assertEquals(books.size(), 3);
    }

}
