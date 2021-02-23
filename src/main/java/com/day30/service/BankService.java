package com.day30.service;

import com.day30.domain.Bank;

import java.util.List;

/**
 * @Auther:嘻嘻
 * @Date:2021/1/30 - 01 - 30 - 23:28
 * @Description:com.day30.service
 * @version:v1.0.0
 */
public interface BankService {

    int addBank(Bank bank);

    List<Bank> queryBanks();

    int removeBank(Integer id);

    int modifyBank(Integer id);

}
