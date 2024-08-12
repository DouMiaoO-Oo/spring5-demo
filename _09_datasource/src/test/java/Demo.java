import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class Demo {
    @Test
    public void demo()
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_v2.xml");

        DataSource ds1 = context.getBean("druid_datasource", DataSource.class);
        System.out.println("druid_datasource:");
        System.out.println(ds1);
        System.out.println("---------------------------------");

        DataSource ds2 = context.getBean("C3P0_datasource", DataSource.class);
        System.out.println("C3P0_datasource");
        System.out.println(ds2);


        System.out.println("---------------------------------");
        System.out.println(context.getBean(org.example.Utils.class));;
    }
}
