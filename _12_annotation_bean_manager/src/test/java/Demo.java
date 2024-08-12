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
        BookDao bookDao = context.getBean(BookDao.class);  // 按照类型获取 Bean

        // @Component注解没有名称 默认值就是当前类名首字母小写"bookServiceImpl"
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);  // 按名称获取 Bean 并指定类型
        System.out.println(bookDao);
        System.out.println(context.getBean(BookDao.class));  // 2次地址不一样 prototype 生效
        System.out.println(bookService);

        /*
         java.lang.NullPointerException: Cannot invoke "org.example.dao.BookDao.save()" because "this.bookDao" is null
         还没有注入 bookDao
         */
//        bookService.save();


        /*
          只有 singleton 会执行 destroy 的钩子方法
         */
//        context.close();  //  关闭容器
        context.registerShutdownHook();  // 注册钩子关闭容器
    }
}
