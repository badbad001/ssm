package cn.itcast.mapper;

import cn.itcast.pojo.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: badbad
 * @Date: 2019/9/10 13:26
 * @Version 1.0
 */
public interface AccountMapper {

    @Select("select * from account where uid = #{userId}")
    List<Account> findByUserId(Integer userId);

    @Select("select * from account")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "uid",property = "uid"),
            @Result(column = "money",property = "money"),
            @Result(column = "uid",property = "user",
                one = @One(select = "cn.cn.itcast.mapper.UserMapper.findById")
            )
    })
    List<Account> findAll();
}
