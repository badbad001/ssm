package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: badbad
 * @Date: 2019/9/14 19:29
 * @Version 1.0
 */
@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 查询请求
     * @param id
     * @return
     */
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public String get(@PathVariable("id")Integer id){
        System.out.println("get---查询请求" + id);
        return "success";
    }

    /**
     * 添加请求
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String save(){
        System.out.println("put---添加请求");
        return "success";
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id")Integer id){
        System.out.println("delete---删除请求"+id);
        return "success";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update(){
        System.out.println("put---更新请求");
        return "success";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String update(HttpServletRequest request){
        System.out.println("request = " + request);
        System.out.println("put---更新请求");
        return "success";
    }


    @Autowired
    private HttpServletRequest request;





}
