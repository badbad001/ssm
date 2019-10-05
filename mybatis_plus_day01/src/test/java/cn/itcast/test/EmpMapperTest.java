package cn.itcast.test;

import cn.itcast.mapper.EmpMapper;
import cn.itcast.pojo.Emp;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: badbad
 * @Date: 2019/10/4 21:03
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmpMapperTest {

    @Autowired
    public EmpMapper empMapper;

    @Test
    public void  demo1(){
        Emp emp = empMapper.selectById(1);

        System.out.println(emp);
    }

    @Test
    public void  demo2(){
        Emp emp = new Emp();
        emp.setEmpName("马化腾");
        emp.setEmpAge(20);
        emp.setEmpSalary(2000d);
        empMapper.insert(emp);


        System.out.println(emp.getEmpId());
    }


    @Test
    public void  demo3(){

        List<Emp> list = empMapper.selectList(
                new QueryWrapper<Emp>()
                        .like("emp_name","马")
                        // or(i -> i.eq("name", "李白").ne("status", "活着"))--->
                        // or (name = '李白' and status <> '活着')
                .or()
                .like("emp_age",10)
        );

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }



}
