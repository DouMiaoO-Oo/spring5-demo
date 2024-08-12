import org.example.dao.UserDao;
import org.example.factory.UserDaoFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForInstanceUser {

    @Test
    public void main()
    {
/*//           手工创建对象
            // 创建实例工厂对象
            UserDaoFactory userDaoFactory = new UserDaoFactory();
            // 通过实例工厂对象创建对象
            UserDao userDao = userDaoFactory.getUserDao();
            userDao.save();*/

        // IOC:
        // 方法1: 通过实例工厂对象得到Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao obj = (UserDao) context.getBean("userDao");
        obj.save();

        //  方法2: 通过FactoryBean得到Bean
        UserDao obj2 = (UserDao) context.getBean("userDaoByFactoryBean");
        obj2.save();
    }
}
