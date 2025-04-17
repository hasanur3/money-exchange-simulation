package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class HighValueTransaction {
    private String customerName;
    private double amount;
    private String transactionId;

    public HighValueTransaction(String customerName, double amount, String transactionId) {
        this.customerName = customerName;
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "HighValueTransaction{" +
                "customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
