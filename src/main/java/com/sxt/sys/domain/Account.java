package com.sxt.sys.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class Account implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编号
     */
    @TableId("ID")
    private Integer id;

    /**
     * 用户编号
     */
    @TableField("UID")
    private Integer uid;

    /**
     * 金额
     */
    @TableField("MONEY")
    private Double money;


}
