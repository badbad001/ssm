package cn.itcast.sys.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 老雷
 * @since 2019-10-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_emp")
public class Emp implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "emp_id", type = IdType.AUTO)
    private Integer empId;

    private String empName;

    private Integer empAge;

    private Double empSalary;


}
