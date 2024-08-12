package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("setBookDao start");
        this.bookDao = bookDao;
    }
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
