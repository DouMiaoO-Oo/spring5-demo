package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private BookDaoImpl(){
        System.out.println("call private constructor BookDaoImpl()");
    };
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
