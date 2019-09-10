package cn.itcast.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author: badbad
 * @Date: 2019/9/9 13:17
 * @Version 1.0
 */
@Data
public class Dep {
    private Integer depId;
    private String depName;
    private List<Emp> emps;
}
