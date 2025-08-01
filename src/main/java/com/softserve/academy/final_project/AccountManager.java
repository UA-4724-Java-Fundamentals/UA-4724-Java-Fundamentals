package com.softserve.academy.final_project;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private final List<Account> accounts = new ArrayList<>();

    public Account createAccount() {
        String cardNumber = CardGenerator.generateCardNumber();
        String pin = CardGenerator.generatePin();

        Account account = new Account(cardNumber, pin);
        accounts.add(account);

        return account;
    }

    public Account findAccount(String cardNumber, String pin) {
        for (Account acc : accounts) {
            if (acc.getCardNumber().equals(cardNumber) && acc.getPin().equals(pin)) {
                return acc;
            }
        }
        return null;
    }
}

