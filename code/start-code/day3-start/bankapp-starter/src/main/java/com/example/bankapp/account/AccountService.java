package com.example.bankapp.account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    List<Account> getAll();
    Account getById(Integer id);
    void transfer(Integer fromId, Integer toId, BigDecimal amount);
}
