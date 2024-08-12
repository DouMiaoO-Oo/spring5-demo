import org.example.config.SpringConfig;
import org.example.domain.Account;
import org.example.service.AccountService;
import org.example.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TransactionTest {
    @Test
    public void testDemo(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        accountService.transfer(1,2, 10d);
    }
}
