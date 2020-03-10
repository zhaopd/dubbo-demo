package com.wish.dubboweb.controller;


import com.wish.api.AccountService;
import com.wish.model.Account;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    private Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Reference
    AccountService accountService;


    @GetMapping("/accounts")
    public String getAccounts(){
        StringBuffer sb = new StringBuffer();
        List<Account> accounts = accountService.getAllAccount();
        if (accounts.isEmpty()){
            logger.info("空");
            return "没找到数据";
        }else {
            accounts.forEach((x)-> sb.append(x.getUsername()).append("|"));
        }

        logger.info(sb.toString());
        return sb.toString();
    }
}
