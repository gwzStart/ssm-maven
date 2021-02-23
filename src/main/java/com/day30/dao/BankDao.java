package com.day30.dao;

import com.day30.domain.Bank;

import java.util.List;

/**
 * @Auther:嘻嘻
 * @Date:2021/1/30 - 01 - 30 - 23:18
 * @Description:com.day30.dao
 * @version:v1.0.0
 */
public interface BankDao {

    int insertBank(Bank bank);

    List<Bank> selectBanks();

    int deleteBank(Integer id);

    int updateBank(Integer id);

}
