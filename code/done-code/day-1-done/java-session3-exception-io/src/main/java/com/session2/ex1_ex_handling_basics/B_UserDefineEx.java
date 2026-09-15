package com.session2.ex1_ex_handling_basics;
//some account application
//bank rules: 1000 is minimum balance to open the account, keep min 1000 in any case, or go back to home :(
//over fund is not allowed u can not have more then 200000 in ur account
//AccountOpenException,InsufficientBalanceException,OverFundException

import java.util.Scanner;

//user define exception, aka checked ex ( wife there could be rain take this umberalla)
class AccountOpenException extends  Exception{
    public AccountOpenException(String message){
        super(message);
    }
}

class Account {
    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) throws  AccountOpenException{
            if(balance<1000){
                throw new AccountOpenException("Insufficient balance");
            }
            this.id = id;
            this.name = name;
            this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

//this may be writen by someone else, he now aware risk involved
public class B_UserDefineEx {
    //dont use throws from main:
    public static void main(String[] args) throws  AccountOpenException {
            Account account = new Account(1, "John", 10000);
            account.deposit(500);
            account.withdraw(2000);
            System.out.println(account.getBalance());

    }
}
