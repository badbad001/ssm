package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: badbad
 * @Date: 2019/9/10 13:26
 * @Version 1.0
 */
public interface UserMapper {

    @Select("select * from user")
    @Results({
            @Result(id = true,column = "id",property = "userId"),
            @Result(column = "username",property = "userName"),
            @Result(column = "address",property = "userAddress"),
            @Result(column = "sex",property = "userSex"),
            @Result(column = "birthday",property = "userBirthday"),
            @Result(column = "id",property = "accounts",
               many = @Many(select = "cn.itcast.mapper.AccountMapper.findByUserId")
            )
    })
    List<User> findAll();

    @Select("select * from user where id = #{id}")
    User findById(Integer id);
}
