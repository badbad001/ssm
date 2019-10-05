package cn.itcast.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: badbad
 * @Date: 2019/9/19 17:30
 * @Version 1.0
 */

@TableName("tb_emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

    @TableId(type = IdType.AUTO)
    private Integer empId;
    private String empName;
    private Integer empAge;
    private Double empSalary;

}
