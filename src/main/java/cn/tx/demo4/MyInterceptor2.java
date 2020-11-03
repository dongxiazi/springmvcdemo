package cn.tx.demo4;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: xiazidong
 * @Date: 2020/11/3
 */
public class MyInterceptor2 implements HandlerInterceptor {
    /**
     * 拦截controller方法，先进入这个方法，放行了才可以执行controller的方法
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     * true 放行
     * false 拦截
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器方法preHandle执行");
//        request.getRequestDispatcher("/index.jsp").forward(request,response);
//        return false;手动跳转，拦截不放行
        return true;//放行
    }

    /**
     * controller方法执行后，要拦截的方法，
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器方法postHandle执行");
        //也可以跳转页面
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    /**
     * 渲染的页面执行完成了，最后执行的方法
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器方法afterCompletion执行");
    }
}
