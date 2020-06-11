package org.example.accountservice.model;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private boolean isActive;

    public Account() {
    }

    public Account(int accountNumber, String accountHolderName, boolean isActive) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.isActive = isActive;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
