import com.julin.pojo.User;
import com.julin.pojo.UserNew;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserNew user = (UserNew) context.getBean("user3");
        user.show();
    }
}
