package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: badbad
 * @Date: 2019/9/11 11:56
 * @Version 1.0
 */
public class IOCTest {

    @Test
    public void demo1(){
         //1.根据配置文件创建ioc容器对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
         //2.根据注册的id获取对象
        //2.1强转
        UserDao userDao = (UserDao) ioc.getBean("userDao");
        //2.2指定class，来返回
        UserService userService = ioc.getBean("userService", UserService.class);

        System.out.println(userDao);
        System.out.println(userService);
    }
}
