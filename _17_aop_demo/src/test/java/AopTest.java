import org.example.config.SpringConfig;
import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    @Test
    public void quickStart(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDao.class);
        bookDao.save();
        System.out.println();

        bookDao.delete();
        System.out.println();

        bookDao.update();
        System.out.println();

        bookDao.find();
        System.out.println();

        String name = bookDao.selectByName("hello_world", false); //  测试 after. 异常时依然可以打印
        System.out.println("selectByName 返回值: " + name);
    }
}
