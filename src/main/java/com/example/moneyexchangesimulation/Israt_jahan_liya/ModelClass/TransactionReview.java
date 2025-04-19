package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class TransactionReview {
    private String transactionId;
    private double amount;
    private String customerHistory;
    private boolean isCompliant;
    private String reviewStatus;

    public TransactionReview(String transactionId, double amount, String customerHistory, boolean compliant, String reviewStatus) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.customerHistory = customerHistory;
        this.isCompliant = compliant;
        this.reviewStatus = reviewStatus;
    }

    // Getters and setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerHistory() {
        return customerHistory;
    }

    public void setCustomerHistory(String customerHistory) {
        this.customerHistory = customerHistory;
    }

    public boolean isCompliant() {
        return isCompliant;
    }

    public void setCompliant(boolean compliant) {
        this.isCompliant = compliant;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    @Override
    public String toString() {
        return "TransactionReview{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", customerHistory='" + customerHistory + '\'' +
                ", isCompliant=" + isCompliant +
                ", reviewStatus='" + reviewStatus + '\'' +
                '}';
    }
}
