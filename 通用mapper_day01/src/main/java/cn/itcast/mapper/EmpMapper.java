package cn.itcast.mapper;

import cn.itcast.pojo.Emp;
import tk.mybatis.mapper.additional.idlist.DeleteByIdListMapper;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @Author: badbad
 * @Date: 2019/9/19 17:31
 * @Version 1.0
 */
public interface EmpMapper extends Mapper<Emp>, SelectByIdListMapper<Emp,Integer>, InsertListMapper<Emp>, DeleteByIdListMapper<Emp,Integer> {

}
