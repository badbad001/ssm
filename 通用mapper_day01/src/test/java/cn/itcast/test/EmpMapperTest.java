package cn.itcast.test;

import cn.itcast.mapper.EmpMapper;
import cn.itcast.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: badbad
 * @Date: 2019/9/19 17:31
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmpMapperTest {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testSelectAll(){
        List<Emp> list = empMapper.selectAll();
        list.forEach(System.out::println);

    }

    @Test
    public void testSelectByIdList(){

        List<Emp> list = empMapper.selectByIdList(Arrays.asList(1, 2));
        list.forEach(System.out::println);

    }
    @Test
    public void testInsertList(){
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(null,"马化腾",null,5000d));
        list.add(new Emp(null,"马化腾",null,5000d));
        list.add(new Emp(null,"马化腾",null,5000d));
        empMapper.insertList(list);
    }

    @Test
    public void testDeleteIdList(){

        empMapper.deleteByIdList(Arrays.asList(4,5,6,7));
    }

}
