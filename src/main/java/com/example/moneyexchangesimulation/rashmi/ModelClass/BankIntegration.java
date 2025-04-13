package com.example.moneyexchangesimulation.rashmi.ModelClass;

public class BankIntegration {
    private int accountNumber;
    private String bankDetails;

    public BankIntegration() {
    }

    public BankIntegration(int accountNumber, String bankDetails) {
        this.accountNumber = accountNumber;
        this.bankDetails = bankDetails;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    @Override
    public String toString() {
        return "BankIntegration{" +
                "accountNumber=" + accountNumber +
                ", bankDetails='" + bankDetails + '\'' +
                '}';
    }
}
