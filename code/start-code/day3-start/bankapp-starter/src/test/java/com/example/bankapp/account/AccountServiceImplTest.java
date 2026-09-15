package com.example.bankapp.account;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountServiceImplTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountServiceImpl accountService;

    @Test
    void transferMoney() {
        Account raj = new Account(1, "Raj", new BigDecimal("1000.00"));
        Account ekta = new Account(2, "Ekta", new BigDecimal("1000.00"));

        when(accountRepository.findById(1)).thenReturn(java.util.Optional.of(raj));
        when(accountRepository.findById(2)).thenReturn(java.util.Optional.of(ekta));

        accountService.transfer(1, 2, new BigDecimal("200.00"));

        assertThat(raj.getBalance()).isEqualByComparingTo("800.00");
        assertThat(ekta.getBalance()).isEqualByComparingTo("1200.00");
    }
}
