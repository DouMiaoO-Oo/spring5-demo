package org.example.factory;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){  // 非 static 方法
        return new UserDaoImpl();
    }
}
