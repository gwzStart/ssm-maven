package com.day30.service.impl;

import com.day30.dao.BankDao;
import com.day30.domain.Bank;
import com.day30.service.BankService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:嘻嘻
 * @Date:2021/1/30 - 01 - 30 - 23:28
 * @Description:com.day30.service.impl
 * @version:v1.0.0
 */
@Service
public class BankServiceImpl implements BankService {

    @Resource
    private BankDao bankDao;

    @Override
    public int addBank(Bank bank) {
        return bankDao.insertBank(bank);
    }

    @Override
    public List<Bank> queryBanks() {
        return bankDao.selectBanks();
    }

    @Override
    public int removeBank(Integer id) {
        return bankDao.deleteBank(id);
    }

    @Override
    public int modifyBank(Integer id) {
        return bankDao.updateBank(id);
    }
}
