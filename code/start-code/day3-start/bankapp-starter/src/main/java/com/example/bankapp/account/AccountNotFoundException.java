package com.example.bankapp.account;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(Integer id) {
        super("Account not found: " + id);
    }
}
