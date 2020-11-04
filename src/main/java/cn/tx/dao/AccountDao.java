package cn.tx.dao;

import cn.tx.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: xiazidong
 * @Date: 2020/11/4
 */
public interface AccountDao {
    @Select("select * from account")
    public List<Account> findAll();
    @Insert("insert into account(name,money) values (#{name},#{money})")
    void save(Account account);
}
