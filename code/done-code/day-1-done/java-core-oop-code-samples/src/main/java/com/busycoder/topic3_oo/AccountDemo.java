package com.busycoder.topic3_oo;

public class AccountDemo {

    public static void main(String[] args) {
        // Account is the class (blueprint).
       Account account=new Account(121,5678.00);

       //account.print();
        System.out.println(account);


        System.out.println("Counter: " + Account.getCounter());

    }
}
