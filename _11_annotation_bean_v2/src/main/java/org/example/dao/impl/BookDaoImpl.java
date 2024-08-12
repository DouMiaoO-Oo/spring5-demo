package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Component;

@Component("bookDao")
public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("constructor: BookDaoImpl");
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." );
    }
}
