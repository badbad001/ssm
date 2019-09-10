package cn.itcast.pojo;

import lombok.Data;

/**
 * @Author: badbad
 * @Date: 2019/9/9 13:17
 * @Version 1.0
 */
@Data
public class Emp {
    private Integer empId;
    private String empName;
    private Dep dep;
}
