package com.bankapp.controller;

import com.bankapp.dto.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repository.AccountRepo;
import com.bankapp.repository.AccountRepoMapImpl;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;

import java.math.BigDecimal;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        //latter we will write rest endpoints
        //Controller is the entry point of our application
        AccountRepo accountRepo=new AccountRepoMapImpl();
        AccountService accountService=new AccountServiceImpl(accountRepo);
        //let we print all the account
        List<Account> accounts=accountService.getAllAccounts();
        accounts.forEach(acc->System.out.println(acc));


        accountService.transfer(1, 2, new BigDecimal(20000));


        accounts=accountService.getAllAccounts();
        accounts.forEach(acc->System.out.println(acc));
    }
}
