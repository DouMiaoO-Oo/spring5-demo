import org.example.dao.BookDao;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
    @Test
    public void demo()
    {
        /*
        ApplicationContext是立即加载，容器加载的时候就会创建bean对象
        ApplicationContext要想成为延迟加载，需要在Bean标签内配置 lazy-init="true"
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao obj = context.getBean(BookDao.class);  // 按照类型获取 Bean
        System.out.println(obj);
    }

    @Test
    public void beanFactoryDemo(){
        /*
            BeanFactory是延迟加载，只有在获取bean对象的时候才会去创建
         */
        Resource resources = new ClassPathResource("applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(resources);
        BookDao bookDao = bf.getBean(BookDao.class);
        System.out.println(bookDao);
    }
}
