import com.julin.dao.UserDaoImpl;
import com.julin.dao.UserDaoOracleImpl;
import com.julin.service.UserService;
import com.julin.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {

    @Test
    public void getUser(){
        //用户实际调用的是业务层，dao实际上不接触
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
