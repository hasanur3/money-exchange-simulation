package com.example.moneyexchangesimulation.rashmi.ModelClass;

import java.time.LocalDate;

public class Transaction {
    private int transactionID;
    private LocalDate transactionDate;
    private String currencyType;
    private double amount;

    public Transaction() {
    }

    public Transaction(int transactionID, LocalDate transactionDate, String currencyType, double amount) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.currencyType = currencyType;
        this.amount = amount;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", transactionDate=" + transactionDate +
                ", currencyType='" + currencyType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
