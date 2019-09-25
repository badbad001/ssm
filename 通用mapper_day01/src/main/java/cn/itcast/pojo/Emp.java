package cn.itcast.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: badbad
 * @Date: 2019/9/19 17:30
 * @Version 1.0
 */
@Table(name = "tb_emp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Id
    private Integer empId;
    private String empName;
    private Integer empAge;
    private Double empSalary;

}
