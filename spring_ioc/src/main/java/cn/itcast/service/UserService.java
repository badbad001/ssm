package cn.itcast.service;

import cn.itcast.dao.UserDao;

/**
 * @Author: badbad
 * @Date: 2019/9/11 11:55
 * @Version 1.0
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("userDao注入成功");
    }
}
