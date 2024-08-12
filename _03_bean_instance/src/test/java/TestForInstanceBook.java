import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForInstanceBook {
    @Test
    public static void main(String[] args) {
//        BookDao bd = new BookDaoImpl();  // 'BookDaoImpl()' has private access in 'org.example.dao.impl.BookDaoImpl'

        // IOC 通过反射从私有构造方法中创建对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
