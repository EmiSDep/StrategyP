package com.emisdep;

public class BankAccount {
    private int accountNumber;
    private String owner;
    private int balance;
    private String type;

    public BankAccount(int accountNumber, String owner, int balance, String type) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.type = type;
    }

}
