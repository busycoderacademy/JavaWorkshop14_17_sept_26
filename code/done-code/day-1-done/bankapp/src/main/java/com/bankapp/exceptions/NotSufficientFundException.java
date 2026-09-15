package com.bankapp.exceptions;
//u an create your own exception
public class NotSufficientFundException extends RuntimeException {

   public NotSufficientFundException(String message) {
      super(message);
   }
}
