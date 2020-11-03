package cn.tx.demo3;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * 程序出现异常，请用异常处理器中的的方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
      //在控制台打印异常信息
        e.printStackTrace();
        //做强转
        SysException exception=null;
        if (e instanceof SysException){
            exception= (SysException) e;
        }else {
            exception=new SysException("系统正在维护，请联系管理员");
        }
        //存入异常提示信息
        ModelAndView mv=new ModelAndView();
        mv.addObject("errorMsg",exception.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
