package com.bankapp.repository;

import com.bankapp.dto.Account;
import com.bankapp.exceptions.DataAcessException;

import java.sql.SQLException;
import java.util.List;

public interface AccountRepo {
    public List<Account> getAllAccounts() throws DataAcessException;
    public Account getAccountById(int id);
    public Account updateAccount(Account account);
}
