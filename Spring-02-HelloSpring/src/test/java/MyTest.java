import com.julin.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在Spring中管理了，我们要使用，直接在里面取出来就行了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
