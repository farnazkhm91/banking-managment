package com.projectuni.bankingmanagement.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.projectuni.bankingmanagement.model.entity.Customers;
import com.projectuni.bankingmanagement.model.entity.Deposit;
import com.projectuni.bankingmanagement.model.enums.TransactionsStatus;
import com.projectuni.bankingmanagement.model.enums.TransactionsType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public final class TransactionDto
{
    @JsonIgnore
    private Customers customer;

    @JsonProperty("price")
    private double price;

    @JsonProperty("transactions_status")
    private TransactionsStatus transactionsStatus;

    @JsonProperty("transactions_type")
    private TransactionsType transactionsType;

    @JsonIgnore
    private Deposit to;

    @JsonIgnore
    private Deposit from;

    @JsonProperty("to")
    private DepositDto toDeposit;

    @JsonProperty("from")
    private DepositDto fromDeposit;

    @JsonProperty("transaction_description")
    private String description;
}
