package com.busycoder.topic3_oo;

/**
 * A simple domain object representing a bank account.
 * how to craete class, ctr , getter setter , busines logic
 * encapsulation understanding
 * demo this keyword
 */
public class Account {
    private int accountNumber;
    private double balance;
    private static int counter;

    //ctr: inilize the isntance variablke
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        counter++;
    }
    //how to access static variable

    public static int getCounter(){
//        System.out.println(this.accountNumber);
        return counter;
    }

   //getter and setter
    public int getAccountNumber(){

        return accountNumber;
    }

    //getter for balance
    public double getBalance(){
        return balance;
    }

    //settter for accountNumber
//    public void setAccountNumber(int accountNumber){
//        this.accountNumber = accountNumber;
//    }
//

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String toString(){
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance +"]";
    }

}
