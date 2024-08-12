package org.example.service.impl;

import org.example.service.BookService;
import org.example.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        System.out.println("setBookDao start");
        this.bookDao = bookDao;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // 初始化方法, 会在类中属性设置之后执行
        System.out.println("service init");
    }
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }
}
