package com.busycoder.topic5_abstraction;

public class AbstractionEncapsulationDemo implements BankingService {

    @Override
    public void deposit(Account account, double amount) {
        // The client does not need to know how Account stores its balance.
        account.deposit(amount);
    }

    public static void main(String[] args) {
        AbstractionEncapsulationDemo service = new AbstractionEncapsulationDemo();
        Account account = new Account(101, 10_000);

        service.deposit(account, 2_500);

        System.out.println("Balance = " + account.getBalance());

        // account.balance cannot be changed directly because it is private.
        // This protects the object's state and preserves valid invariants.
    }
}
