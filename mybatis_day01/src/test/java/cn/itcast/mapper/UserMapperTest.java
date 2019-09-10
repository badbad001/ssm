package cn.itcast.mapper;


import cn.itcast.pojo.Dep;
import cn.itcast.pojo.Emp;
import cn.itcast.pojo.User;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: badbad
 * @Date: 2019/9/8 20:38
 * @Version 1.0
 */
public class UserMapperTest {

    @Test
    public void findAll() throws IOException {
        //1.加载主配置文件，获取流
        String resource = "mybatis-config.xml";
        //2.这里用的类加载器来加载配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //3.这里用构建者模式来来产生sqlSessiong工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //4.用工厂模式来产生sqlsession,打开链接对像
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.用代理模式来产生一个代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //6.调用方法
        List<User> list = userMapper.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void demo2() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        DepMapper mapper = session.getMapper(DepMapper.class);
        Dep dep = mapper.findByIdOnUnion(1);
        System.out.println(dep);
    }

    @Test
    public void demo3() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        DepMapper mapper = session.getMapper(DepMapper.class);
        Dep dep = mapper.findByIdOnStep(1);
        System.out.println(dep.getDepId());
        System.out.println(dep.getEmps());
    }

    @Test
    public void demo4() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.findByIdOnUnion(1);
        System.out.println(emp.getEmpName());
        System.out.println(emp.getDep());
    }
    @Test
    public void demo5() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.findById(1);
        System.out.println(emp.getEmpName());
        System.out.println(emp.getDep());


    }

    @Test
    public void demo6() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        EmpMapper mapper = session.getMapper(EmpMapper.class);
        List<Emp> list = mapper.findByIds(Arrays.asList(1, 2));
        list.forEach(System.out::println);
    }

    @Test
    public void demo7() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        EmpMapper mapper = session.getMapper(EmpMapper.class);
        PageHelper.startPage(1,2);
        List<Emp> list = mapper.findAll();
        list.forEach(System.out::println);
    }


}
