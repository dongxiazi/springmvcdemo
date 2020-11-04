package cn.tx.service.impl;

import cn.tx.dao.AccountDao;
import cn.tx.domain.Account;
import cn.tx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xiazidong
 * @Date: 2020/11/4
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有的账号...");
        return  accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
}
