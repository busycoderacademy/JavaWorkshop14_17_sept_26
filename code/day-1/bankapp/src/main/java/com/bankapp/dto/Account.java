package com.bankapp.dto;

import lombok.*;

import java.math.BigDecimal;
//record is a new feature in java 14, immutable object
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {
    private int id;
    private String name;
    private BigDecimal balance;
}
