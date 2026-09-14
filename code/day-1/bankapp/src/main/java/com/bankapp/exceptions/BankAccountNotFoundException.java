package com.bankapp.exceptions;
//u an create your own exception
public class BankAccountNotFoundException extends RuntimeException {

   public BankAccountNotFoundException(String message) {
      super(message);
   }
}
