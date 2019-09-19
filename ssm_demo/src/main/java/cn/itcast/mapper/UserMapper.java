package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: badbad
 * @Date: 2019/9/17 17:21
 * @Version 1.0
 */
public interface UserMapper {

    @Select("select * from user")
    public List<User> findAll();
}
