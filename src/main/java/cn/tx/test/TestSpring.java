package cn.tx.test;

import cn.tx.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xiazidong
 * @Date: 2020/11/4
 */
public class TestSpring {
    @Test
    public void run1() {
        //创建工厂加载配置项
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取service，对象调用方法
        AccountService accountService = context.getBean(AccountService.class);
        accountService.findAll();
    }


}
