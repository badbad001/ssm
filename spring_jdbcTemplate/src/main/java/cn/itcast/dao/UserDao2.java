package cn.itcast.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: badbad
 * @Date: 2019/9/12 15:50
 * @Version 1.0
 */
//@Repository
public class UserDao2 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void delete(Integer id){

        jdbcTemplate.update("delete from user where id = ?",id);
    }
}
