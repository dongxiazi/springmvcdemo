package cn.tx.service;

import cn.tx.domain.Account;

import java.util.List;

/**
 * @Author: xiazidong
 * @Date: 2020/11/4
 */
public interface AccountService {
    public List<Account> findAll();

    void save(Account account);
}
