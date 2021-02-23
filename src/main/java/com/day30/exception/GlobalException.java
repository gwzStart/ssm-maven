package com.day30.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther:嘻嘻
 * @Date:2021/1/31 - 01 - 31 - 15:01
 * @Description:com.day30.exception
 * @version:v1.0.0
 */

@ControllerAdvice   //控制器增强
public class GlobalException {
    //定义方法,处理异常
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception e) {
        //1.记录异常到日志文件
        //2.发送通知给相关人员
        //3.给用户友好的提示
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "用户名不正确");
        mv.addObject("e", e);
//        mv.setViewName("nameError");
        return mv;
    }

    //处理其他异常
    @ExceptionHandler()
    public ModelAndView doOtherException(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("e", e);
//        mv.setViewName("defaultError");
        return mv;
    }


}
