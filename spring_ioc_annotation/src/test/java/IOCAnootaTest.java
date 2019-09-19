
import cn.itcast.conf.ApplicationContextConfigure;
import cn.itcast.dao.UserDao;
import cn.itcast.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @Author: badbad
 * @Date: 2019/9/11 11:56
 * @Version 1.0
 */
public class IOCAnootaTest {

    @Test
    public void demo1(){
         //1.根据spring的配置类创建ioc容器对象
        ApplicationContext ioc = new AnnotationConfigApplicationContext(ApplicationContextConfigure.class);
         //2.根据注册的id获取对象
        //2.1强转
        UserDao userDao = (UserDao) ioc.getBean("userDao");
        //2.2指定class，来返回
        UserService userService = ioc.getBean("userService", UserService.class);

        DataSource dataSource = ioc.getBean("dataSource", DataSource.class);
        System.out.println(userDao);
        System.out.println(userService);
        System.out.println(dataSource);
    }
}
