package com.bankapp.controller;

import com.bankapp.dto.Account;
import com.bankapp.exceptions.DataAcessException;
import com.bankapp.repository.AccountRepo;
import com.bankapp.repository.AccountRepoJdbcImpl;
import com.bankapp.repository.AccountRepoJpaImpl;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        //latter we will write rest endpoints
        //Controller is the entry point of our application
        AccountRepo accountRepo=new AccountRepoJdbcImpl();
        AccountService accountService=new AccountServiceImpl(accountRepo);
        //let we print all the account
       try{
           List<Account> accounts=accountService.getAllAccounts();
           accounts.forEach(acc->System.out.println(acc));
       }catch (DataAcessException e){
           System.out.println(e.getCause());
       }

//
//        accountService.transfer(1, 2, new BigDecimal(20000));
//
//
//        accounts=accountService.getAllAccounts();
//        accounts.forEach(acc->System.out.println(acc));
    }
}
