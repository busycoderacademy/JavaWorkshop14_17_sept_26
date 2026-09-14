package com.bankapp.repository;

import com.bankapp.dto.Account;

import java.util.List;

public interface AccountRepo {
    public List<Account> getAllAccounts();
    public Account getAccountById(int id);
    public Account updateAccount(Account account);
}
