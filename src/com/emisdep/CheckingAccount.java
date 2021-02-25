package com.emisdep;

public class CheckingAccount implements Deposit {

    private int balance;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }


    @Override
    public void depositMoney(int amount) {
        System.out.println("deposited " + amount + " to checking account. current balance is :" + Integer.sum(balance, amount));

    }
}
