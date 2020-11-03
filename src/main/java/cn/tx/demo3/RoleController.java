package cn.tx.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    /**
     * 使用异常处理器
     * @return
     */
    @RequestMapping("/findAll.do")
    public String findAll(){
        System.out.println("执行了。。。。");
        //模拟异常
        int a=10/0;
        return "suc";
    }
}
