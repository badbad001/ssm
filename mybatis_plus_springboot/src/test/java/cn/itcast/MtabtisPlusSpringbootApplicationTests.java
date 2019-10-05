package cn.itcast;

import cn.itcast.mapper.EmpMapper;
import cn.itcast.pojo.Emp;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MtabtisPlusSpringbootApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void contextLoads() {

        Emp emp = empMapper.selectById(1);
        System.out.println(emp);
    }
    @Test
    public void demo2() {

        IPage<Emp> page = empMapper.selectPage(new Page<>(1, 2), null);

        System.out.println(page.getTotal());
        for (Emp emp : page.getRecords()) {

            System.out.println(emp);
        }
    }

}
