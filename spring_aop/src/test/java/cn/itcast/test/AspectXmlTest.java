package cn.itcast.test;

import cn.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: badbad
 * @Date: 2019/9/12 0:10
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AspectXmlTest {

    @Autowired
    private UserService userService;

    @Test
    public void testBefore(){
        userService.save();
    }

    @Test
    public void testAfterReturning(){
        userService.update();
    }

    @Test
    public void testAround(){
        userService.delete();
    }

    @Test
    public void testAfterThrowing(){
        userService.delete();
    }

    @Test
    public void testAfterg(){
        userService.delete();
    }
}
