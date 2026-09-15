package com.bankapp.service;

import com.bankapp.dto.Account;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public interface AccountService {
   public List<Account> getAllAccounts();
   public Account getAccountById(int id);
   public void transfer(int fromAccId, int toAccId, BigDecimal amount);
}
