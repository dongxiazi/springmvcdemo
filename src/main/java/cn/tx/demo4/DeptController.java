package cn.tx.demo4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @RequestMapping("/findAll.do")
    public String findAll(){
        System.out.println("执行了。。。");
        return "suc";
    }
}
