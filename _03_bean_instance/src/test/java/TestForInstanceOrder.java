import org.example.dao.OrderDao;
import org.example.factory.OrderDaoFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForInstanceOrder {

    @Test
    public void main()
    {
        // 手工创建对象
        OrderDao orderDao = OrderDaoFactory.getOrderDao(); // 通过静态工厂获得对象
        orderDao.save();

        System.out.println("------------------------------------");

        // 从 IOC 获得对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao obj = (OrderDao) context.getBean("orderDao");
        obj.save();
    }
}
