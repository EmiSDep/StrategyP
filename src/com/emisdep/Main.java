package com.emisdep;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CheckingAccount checkingsAccount = new CheckingAccount(0);
        SavingsAccount savingsAccount = new SavingsAccount(123);

        savingsAccount.depositMoney(123);
        checkingsAccount.depositMoney(100);

        System.out.println(checkingsAccount);
        System.out.println(savingsAccount);
    }
}
