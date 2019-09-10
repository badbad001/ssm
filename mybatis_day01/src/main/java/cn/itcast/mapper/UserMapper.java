package cn.itcast.mapper;

import cn.itcast.pojo.User;

import java.util.List;

/**
 * @Author: badbad
 * @Date: 2019/9/8 20:32
 * @Version 1.0
 */
public interface UserMapper {

     List<User> findAll();
}
