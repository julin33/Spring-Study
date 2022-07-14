import com.julin.config.MyConfig;
import com.julin.config.MyConfig2;
import com.julin.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);//注解实现
        User getUser = (User) context.getBean("user");
        System.out.println(getUser.getName());
    }
}
