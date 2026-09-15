package com.busycoder.topic5_abstraction;

import java.math.BigDecimal;

/**
 * Abstraction: clients use a simple operation without knowing its internals.
 */
public interface BankingService {
    void transfer(int fromAccount, int toAccount, BigDecimal amount);
}
