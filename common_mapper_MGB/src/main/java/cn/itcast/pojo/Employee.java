package cn.itcast.pojo;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_emp")
public class Employee {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_age")
    private Integer empAge;

    @Column(name = "emp_salary")
    private Double empSalary;
}