package com.sxt.sys.service.impl;

import com.sxt.sys.domain.Account;
import com.sxt.sys.mapper.AccountMapper;
import com.sxt.sys.service.IAccountService;
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
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
