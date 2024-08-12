package org.example.factory;

import org.example.dao.OrderDao;
import org.example.dao.impl.OrderDaoImpl;

// 静态工厂方法（Static Factory Method）.
// 简单工厂模式又称为静态工厂方法模式
public interface OrderDaoFactory {  // 这里用 interface 或者 class 定义都可以
    public static OrderDao getOrderDao(){
        System.out.println("OrderDaoFactory setup....");
        return new OrderDaoImpl();
    }
}
