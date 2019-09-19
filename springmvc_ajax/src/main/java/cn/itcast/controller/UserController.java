package cn.itcast.controller;

import cn.itcast.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author: badbad
 * @Date: 2019/9/16 20:00
 * @Version 1.0
 */
@Controller
public class UserController {

    @RequestMapping(value = "user",method = RequestMethod.GET)
    @ResponseBody
    public User get(){
        User user = new User();
        user.setUsername("雷军");
        user.setPassword("123");
        user.setBirthday(new Date());
        return user;
    }


    @ResponseBody
    @RequestMapping(value = "user",method = RequestMethod.POST)
    public User add(@RequestBody User user){
        System.out.println(user);
        return user;
    }


    @RequestMapping("demo")
    public void test(String password1,String username1){
        System.out.println(username1);
        System.out.println(password1);
    }
}
