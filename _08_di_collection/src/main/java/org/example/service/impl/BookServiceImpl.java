package org.example.service.impl;

import org.example.service.BookService;
import org.example.dao.BookDao;

import java.util.*;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public String toString() {
        return "BookServiceImpl{" +
                "array=" + Arrays.toString(array) +
                ",\nlist=" + list +
                ",\nset=" + set +
                ",\nmap=" + map +
                ",\nproperties=" + properties +
                '}';
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        System.out.println(this);
        bookDao.save();
    }
}
