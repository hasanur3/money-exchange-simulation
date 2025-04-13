package com.example.moneyexchangesimulation.rashmi.ModelClass;

public class Payment {
private int accountNumber;
private String cardDetails,transactionID,paymentDetails;

    public Payment() {
    }

    public Payment(int accountNumber, String cardDetails, String transactionID, String paymentDetails) {
        this.accountNumber = accountNumber;
        this.cardDetails = cardDetails;
        this.transactionID = transactionID;
        this.paymentDetails = paymentDetails;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(String cardDetails) {
        this.cardDetails = cardDetails;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "accountNumber=" + accountNumber +
                ", cardDetails='" + cardDetails + '\'' +
                ", transactionID='" + transactionID + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                '}';
    }
}
