package com.project.banking.dto;


import lombok.Getter;

@Getter
public class AccountDto {

    private final Long id;
    private final String accountHolderName;
    private final double balance;

    public AccountDto(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}
