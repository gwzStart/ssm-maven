package com.day30.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther:嘻嘻
 * @Date:2021/1/31 - 01 - 31 - 15:26
 * @Description:com.day30.handler
 * @version:v1.0.0
 */
//拦截器类,拦截用户请求
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;

    }
    //方法执行完毕后执行此方法
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //可以对方法返回值进行二次修改
    }

    /*
    * 最后处理,
    * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
            //一般做资源回收用的
    }
}
