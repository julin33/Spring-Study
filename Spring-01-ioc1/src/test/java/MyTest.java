import com.julin.dao.UserDaoImpl;
import com.julin.dao.UserDaoOracleImpl;
import com.julin.service.UserService;
import com.julin.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void getUser(){
    /*    //用户实际调用的是业务层，dao实际上不接触
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();*/

        //获取ApplicationContext 拿到Spring的容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //需要什么就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
}
