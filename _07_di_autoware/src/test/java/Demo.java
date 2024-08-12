import org.example.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
 @Test
    public void demo()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService obj = (BookService) context.getBean("service");  // 通过 name 别名获取 Bean
        obj.save();
    }
}
