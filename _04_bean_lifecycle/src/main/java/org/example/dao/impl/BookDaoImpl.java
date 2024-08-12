package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {
    // bean初始化对应的操作
    public void init(){
        System.out.println("BookDao init--");
    }
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

    // bean销毁前对应的操作
    public void destory(){
        System.out.println("BookDao destory--");
    }
}
