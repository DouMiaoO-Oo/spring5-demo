package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private final Integer connectionNum;
    private final String databaseName;

    public BookDaoImpl(Integer connectionNum, String databaseName) {
        this.connectionNum = connectionNum;
        this.databaseName = databaseName;
    }

    public Integer getConnectionNum() {
        return connectionNum;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save ... connectionNum: " + connectionNum + ", databaseName = " + databaseName);
    }
}
