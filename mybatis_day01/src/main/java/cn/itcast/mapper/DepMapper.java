package cn.itcast.mapper;

import cn.itcast.pojo.Dep;

/**
 * @Author: badbad
 * @Date: 2019/9/9 13:21
 * @Version 1.0
 */
public interface DepMapper {

    Dep findById(Integer depId);

    Dep findByIdOnUnion(Integer depId);

    Dep findByIdOnStep(Integer depId);
}
