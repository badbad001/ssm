package cn.itcast.test;

import cn.itcast.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: badbad
 * @Date: 2019/9/12 15:53
 * @Version 1.0
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JDBCTemplateTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testDelete(){
        userDao.delete(48);
    }
}
