package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    @Override
    public void delete() {
        System.out.println("book dao delete ...");
    }

    @Override
    public void update() {
        System.out.println("book dao update ...");
    }

    @Override
    public void find() {
        System.out.println("book dao find ...");
    }

    @Override
    public String selectByName(String name, Boolean hasException) {
        if(hasException){
            Integer val = 1 / 0;
        }
        System.out.println("book dao selectByName ...");
        return name;
    }
}
