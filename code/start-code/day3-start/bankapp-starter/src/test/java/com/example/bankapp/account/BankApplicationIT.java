package com.example.bankapp.account;

import com.example.bankapp.BankAppApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.mysql.MySQLContainer;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@Testcontainers
@SpringBootTest(classes = BankAppApplication.class)
class BankApplicationIT {

    @Container
    @ServiceConnection
    static MySQLContainer mysql = new MySQLContainer("mysql:8.4");

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void saveAndFindAccountUsingRealMySql() {
        Account account = new Account(101, "Integration Test", new BigDecimal("1500.00"));

        accountRepository.save(account);

        Account result = accountRepository.findById(101).orElseThrow();

        assertThat(result.getName()).isEqualTo("Integration Test");
        assertThat(result.getBalance()).isEqualByComparingTo("1500.00");
    }
}
