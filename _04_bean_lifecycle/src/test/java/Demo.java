import org.example.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
 @Test
    public void demo()
    {
        // ApplicationContext 类型没有 registerShutdownHook
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // ApplicationContext -> ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*
        Spring的IOC容器是运行在JVM中
        运行main方法后,JVM启动,Spring加载配置文件生成IOC容器,从容器获取bean对象，然后调方法执行
        main方法执行完后，JVM退出，这个时候IOC容器中的bean还没有来得及执行销毁就已经结束了
        所以没有调用对应的destroy方法

        解决方法：
            在容器未关闭之前，提前设置好回调函数，让JVM在退出之前回调此函数来关闭容器
        */
        context.registerShutdownHook();  // 注册钩子关闭容器

        BookService obj = (BookService) context.getBean("service");  // 通过 name 别名获取 Bean
        obj.save();
    }
}
