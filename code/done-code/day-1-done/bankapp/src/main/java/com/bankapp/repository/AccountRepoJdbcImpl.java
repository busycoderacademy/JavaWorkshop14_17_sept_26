package com.bankapp.repository;

import com.bankapp.dto.Account;
import com.bankapp.exceptions.DataAcessException;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Some hardcoded data layer
public class AccountRepoJdbcImpl implements  AccountRepo {

    private Map<Integer, Account> accountMap = new HashMap<>();//k, v

    public AccountRepoJdbcImpl() {
        accountMap.put(1, new Account(1, "John", new BigDecimal(1000)));
        accountMap.put(2, new Account(2, "Ekta", new BigDecimal(1000)));
    }

    @Override
    public List<Account> getAllAccounts() {
        System.out.println("jdbc code");
        try{
            if(1==1)
                throw new SQLException("some bad sql quaries");
        }catch (SQLException e){
            //i can wrap this SQL Ex and rethrow it form catch block
            throw new DataAcessException("some bad sql quaries", e);
        }
        return new ArrayList<>(accountMap.values());
    }

    @Override
    public Account getAccountById(int id) {
        return accountMap.get(id);
    }

    @Override
    public Account updateAccount(Account account) {
        accountMap.put(account.getId(), account);
        return account;
    }
}
