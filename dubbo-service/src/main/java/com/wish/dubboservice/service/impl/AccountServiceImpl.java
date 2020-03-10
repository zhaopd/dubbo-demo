package com.wish.dubboservice.service.impl;


import com.wish.api.AccountService;
import com.wish.dubboservice.mapper.AccountMapper;
import com.wish.model.Account;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountMapper accountMapper;


    public List<Account> getAllAccount(){
        System.out.println("come to service to get accounts....");
        List<Account> allAccount = accountMapper.getAllAccount();
        System.out.println("数据大小为->"+allAccount.size());
        return allAccount;
    };
}
