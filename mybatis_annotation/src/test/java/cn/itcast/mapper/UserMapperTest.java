package cn.itcast.mapper;

import cn.itcast.pojo.Account;
import cn.itcast.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: badbad
 * @Date: 2019/9/10 13:35
 * @Version 1.0
 */
public class UserMapperTest {

    private SqlSession session;

    @Before
    public void init() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession();
    }

    @Test
    public void findAll1() {
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User> list = userMapper.findAll();
        for (User user : list) {
            System.out.println(user.getUserName());
            System.out.println(user.getAccounts());
        }
    }
    @Test
    public void findAll2() {
        AccountMapper accountMapper = session.getMapper(AccountMapper.class);
        List<Account> list = accountMapper.findAll();
        for (Account account : list) {
            System.out.println(account.getMoney());
            System.out.println(account.getUser());
        }
    }
}
