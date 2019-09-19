package cn.itcast.service;

import cn.itcast.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: badbad
 * @Date: 2019/9/11 11:55
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

}
