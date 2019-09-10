package cn.itcast.mapper;

import cn.itcast.pojo.Dep;
import cn.itcast.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: badbad
 * @Date: 2019/9/9 13:21
 * @Version 1.0
 */
public interface EmpMapper {

    Emp findById(Integer empId);

    Emp findByIdOnUnion(Integer empId);

    Emp findByIdOnStep(Integer empId);

    List<Emp> findByIds(@Param("ids") List<Integer> ids);


    List<Emp> findAll();
}
