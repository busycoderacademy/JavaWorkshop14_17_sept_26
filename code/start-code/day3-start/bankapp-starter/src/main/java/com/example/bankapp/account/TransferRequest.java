package com.example.bankapp.account;

import java.math.BigDecimal;

public record TransferRequest(Integer fromId, Integer toId, BigDecimal amount) {
}
