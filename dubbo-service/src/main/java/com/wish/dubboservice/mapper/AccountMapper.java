package com.wish.dubboservice.mapper;

import com.wish.model.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    List<Account> getAllAccount();

    Integer addAccount(Account account);

    Integer updateAccount(Account account);

    Integer deleteAccountById(Integer id);

}
