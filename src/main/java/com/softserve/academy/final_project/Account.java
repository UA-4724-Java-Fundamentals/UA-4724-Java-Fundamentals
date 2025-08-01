package com.softserve.academy.final_project;

import java.util.Objects;

public class Account {
    private final String cardNumber;
    private final String pin;
    private int balance;

    public Account(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = 0;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance && Objects.equals(cardNumber, account.cardNumber) && Objects.equals(pin, account.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pin, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                '}';
    }
}
