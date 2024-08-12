package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private Integer connectionNum;
    private String databaseName;

    public Integer getConnectionNum() {
        return connectionNum;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setConnectionNum(Integer connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save ... connectionNum: " + connectionNum + ", databaseName = " + databaseName);
    }
}
