package org.example.dao.impl;

import org.example.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bookDao")
//@Scope("prototype")  // 非单例模式 模式下不会执行 destroy
public class BookDaoImpl implements BookDao {

    @PostConstruct  // bean的初始化方法
    public void init() {
        System.out.println("init ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." );
    }

    @PreDestroy  // bean的销毁方法
    public void destroy() {
        System.out.println("destroy ...");
    }
}
