package cn.itcast.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * @Author: badbad
 * @Date: 2019/9/12 15:50
 * @Version 1.0
 */
//@Repository
public class UserDao extends JdbcDaoSupport {

    public void delete(Integer id){

        this.getJdbcTemplate().update("delete from user where id = ?",id);
    }
}
