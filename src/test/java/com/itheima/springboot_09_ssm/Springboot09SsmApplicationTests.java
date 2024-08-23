package com.itheima.springboot_09_ssm;

import com.itheima.springboot_09_ssm.domain.Book;
import com.itheima.springboot_09_ssm.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot09SsmApplicationTests {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        Book book = bookService.getById(2);
        System.out.println(book);
    }

}
