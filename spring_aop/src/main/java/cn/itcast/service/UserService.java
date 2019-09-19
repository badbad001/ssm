package cn.itcast.service;

/**
 * @Author: badbad
 * @Date: 2019/9/11 21:49
 * @Version 1.0
 */
public class UserService {

    public void save(){
        System.out.println("保存方法。。。");
    }

    public String update(){
        System.out.println("更新方法。。。");
        return "雷军";
    }
    public void delete(){
        System.out.println("删除方法。。。");
        int i= 1/0;

    }
    public void insert(){
        System.out.println("插入方法。。。");
    }
}
