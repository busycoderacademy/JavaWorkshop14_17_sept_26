package com.busycoder.topic10_poly;

public class PolymorphismDemo {

    public static void main(String[] args) {
        // One parent reference can refer to different child objects.
        Account account;

        account = new SavingsAccount();
        account.show(); // SavingsAccount.show()

        account = new CurrentAccount();
        account.show(); // CurrentAccount.show()

        // The reference type controls what members are visible at compile time.
        // The actual object controls which overridden method runs at runtime.
    }
}
