package cn.itcast.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @Author: badbad
 * @Date: 2019/9/8 20:30
 * @Version 1.0
 */
@Data
public class User {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
