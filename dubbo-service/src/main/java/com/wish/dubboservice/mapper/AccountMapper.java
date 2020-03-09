package com.wish.dubboservice.mapper;

import com.wish.dubboservice.entity.Account;

import java.util.List;

public interface AccountMapper {

    List<Account> getAllAccount();

    Integer addAccount(Account account);

    Integer updateAccount(Account account);

    Integer deleteAccountById(Integer id);

}
