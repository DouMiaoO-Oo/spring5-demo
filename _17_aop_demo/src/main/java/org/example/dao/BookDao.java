package org.example.dao;

public interface BookDao {
    void save();

    void delete();

    void update();

    void find();

    String selectByName(String name, Boolean hasException);
}