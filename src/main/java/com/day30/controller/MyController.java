package com.day30.controller;

import com.day30.domain.Bank;
import com.day30.exception.MyException;
import com.day30.exception.NameException;
import com.day30.service.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:嘻嘻
 * @Date:2021/1/30 - 01 - 30 - 22:58
 * @Description:com.day30.controller
 * @version:v1.0.0
 */

@Controller
public class MyController {

    @Resource
    private BankService bankService;

    @RequestMapping("/bank/addBank.do")
    public ModelAndView addBank(Bank bank) {
        ModelAndView mv = new ModelAndView();
        String tips = "添加失败";
        int result = bankService.addBank(bank);
        if (result > 0) {
            tips = "添加成功";
        }
        mv.addObject("tips", tips);
        mv.setViewName("result");
        return mv;
    }


    @RequestMapping("/queryBanks.do")
    @ResponseBody
    public List<Bank> queryBank() {
        List<Bank> list = bankService.queryBanks();
        return list;
    }



}
