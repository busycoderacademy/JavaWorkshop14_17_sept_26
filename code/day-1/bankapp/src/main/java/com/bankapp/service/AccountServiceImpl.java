package com.bankapp.service;

import com.bankapp.dto.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repository.AccountRepo;
import com.bankapp.repository.AccountRepoMapImpl;

import java.math.BigDecimal;
import java.util.List;
//Service layer is the aka brain of ur application
//SL=BL (use case logic)+ Cross cutting concerns (logging, security, transaction management) xxilities
public class AccountServiceImpl implements  AccountService {
    //Bad design
//    private AccountRepo accountRepo=new AccountRepoMapImpl();

    private AccountRepo accountRepo;

    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public List<Account> getAllAccounts() {
        //extra logic
        return accountRepo.getAllAccounts();
    }

    @Override
    public Account getAccountById(int id) {
        //check if account is not null or throw exception
        Account account=accountRepo.getAccountById(id);
        if(account==null){
            throw new BankAccountNotFoundException("Account not found with id: "+id);
        }
        return account;
    }

    @Override
    public void transfer(int fromAccId, int toAccId, BigDecimal amount) {
        //logic of fund transfer
        Account fromAccount=getAccountById(fromAccId);
        Account toAccount=getAccountById(toAccId);

        if(fromAccount.getBalance().compareTo(amount)<0){
            throw new BankAccountNotFoundException("Insufficient balance");
        }
        fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
        toAccount.setBalance(toAccount.getBalance().add(amount));
        accountRepo.updateAccount(fromAccount);
        accountRepo.updateAccount(toAccount);
    }
}




