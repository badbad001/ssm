package cn.itcast.sys.service.impl;

import cn.itcast.sys.pojo.Emp;
import cn.itcast.sys.mapper.EmpMapper;
import cn.itcast.sys.service.EmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老雷
 * @since 2019-10-05
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}
