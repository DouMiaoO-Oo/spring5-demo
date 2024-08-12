import org.example.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.service.AccountService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
// 设置Spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfig.class})  // 加载配置类
// @ContextConfiguration(locations={"classpath:applicationContext.xml"})  // 加载配置文件
public class SpringJUnitTest {
    @Autowired
    private AccountService accountService;  // 支持自动装配注入bean

    @Test
    public void testFindById(){
        System.out.println(accountService.findById(1));

    }
    @Test
    public void testFindAll(){
        System.out.println(accountService.findAll());
    }
    /*@Test
    public void testDemo(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        System.out.println(accountService.findAll());
    }*/
}
