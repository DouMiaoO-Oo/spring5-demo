package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private String ip;

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "BookDaoImpl{" +
                "databaseName='" + databaseName + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }

    @Override
    public void save() {
        System.out.println("book dao save ..." + this);
    }
}
