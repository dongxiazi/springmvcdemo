package cn.tx.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save1.do")
    public String save(){
        System.out.println("执行了。。。。");
        return "suc";
    }

    /**
     * 默认查询 /pages/user/save2.jsp
     */
    @RequestMapping("/save2.do")
    public void save2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("执行了save2。。。。");
//            request.getRequestDispatcher("/pages/suc.jsp").forward(request,response);
        response.getWriter().println("hello");

    }

    /**
     * 返回ModelAndView
     * @return
     */
    @RequestMapping("/save3.do")
    public ModelAndView save3(){
        System.out.println("执行save3.。。");
        ModelAndView mv=new ModelAndView();
        //把一些数据储存mv对象
        mv.addObject("msg","用户名或者密码已存在");
        //设置视图名称
        mv.setViewName("suc");
     return mv;
    }


    @RequestMapping("/save4.do")
    public String save4(){
        System.out.println("执行了。。。。");
        return "forward:/pages/suc.jsp";
    }

    /**
     *  重定向不能传值
     * @return
     */
    @RequestMapping("/save5.do")
    public String save5(){
        System.out.println("执行了save5。。。。");
        return "redirect:/pages/suc.jsp";
    }

    /**
     * @RequestBody 把传过来的json数据封装到User上
     * @param user
     */
    @RequestMapping("/save6.do")
    @ResponseBody
    public User save6(@RequestBody User user){
        System.out.println(user);
     return user;
    }

}
