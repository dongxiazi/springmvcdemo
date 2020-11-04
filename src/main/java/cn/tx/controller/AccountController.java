package cn.tx.controller;

import cn.tx.domain.Account;
import cn.tx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: xiazidong
 * @Date: 2020/11/4
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        System.out.println("表现出:查询所有账号...");
        List<Account> accounts = accountService.findAll();
        for (Account account:accounts){
            System.out.println(account);
        }
        ModelAndView mv=new ModelAndView();
        mv.setViewName("suc");
        return mv;
    }

    @RequestMapping("/save.do")
    public String save(Account account){
        accountService.save(account);
        return "suc";
    }
}
