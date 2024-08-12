import org.example.dao.BookDao;
import org.example.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void demo()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = context.getBean(BookDao.class);  // 按照类型获取 Bean

        // @Component注解没有名称 默认值就是当前类名首字母小写"bookServiceImpl"
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);  // 按名称获取 Bean 并指定类型
        System.out.println(bookDao);
        System.out.println(bookService);
    }
}
