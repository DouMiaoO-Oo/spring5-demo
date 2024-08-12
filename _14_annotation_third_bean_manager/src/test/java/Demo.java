import com.alibaba.druid.pool.DruidDataSource;
import org.example.config.SpringConfig;
import org.example.dao.BookDao;
import org.example.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void demo()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = context.getBean(BookService.class);  // 按名称获取 Bean 并指定类型
        bookService.save();
        DruidDataSource ds = context.getBean(DruidDataSource.class);
        System.out.println(ds);
        System.out.println(
                "-------------------------------------------------" +
                "\nusername: " + ds.getUsername() +
                "\npassword: " + ds.getPassword() +
                "\ndriver: " + ds.getDriverClassName() +
                "\nusl: " + ds.getUrl()
        );
    }
}
