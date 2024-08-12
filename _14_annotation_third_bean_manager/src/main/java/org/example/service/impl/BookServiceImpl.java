package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {

    /*
    @Autowired可以写在属性上，也可也写在setter方法上
    自动装配基于反射设计创建对象并通过暴力反射为私有属性进行设值
     */
    @Autowired
    @Qualifier("bookDao2")  // 有多个同类型 Bean, 指定名称注入. 此时指定注入名称为 bookDao2 的 BookDao 对象
    private BookDao bookDao;


    public void setBookDao(BookDao bookDao) {
        System.out.println("setBookDao start");
        this.bookDao = bookDao;
    }
    @Override
    public void save() {
        System.out.printf("book service save ...");
        bookDao.save();
    }
}
