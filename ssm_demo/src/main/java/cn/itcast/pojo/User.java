package cn.itcast.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: badbad
 * @Date: 2019/9/16 19:58
 * @Version 1.0
 */
@Data
public class User {
    private String username;
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
