package com.emisdep;

public class SavingsAccount implements Deposit{
    private int balance;

    public SavingsAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void depositMoney(int amount) {
        System.out.println("deposited " + amount + " to savings account. current balance is :" + Integer.sum(balance, amount));
    }
}
