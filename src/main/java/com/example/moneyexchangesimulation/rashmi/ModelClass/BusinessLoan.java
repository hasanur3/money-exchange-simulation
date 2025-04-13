package com.example.moneyexchangesimulation.rashmi.ModelClass;

public class BusinessLoan {
    private int accountNumber;
    private String name,email;

    public BusinessLoan() {
    }

    public BusinessLoan(int accountNumber, String name, String email) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BusinessLoan{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
