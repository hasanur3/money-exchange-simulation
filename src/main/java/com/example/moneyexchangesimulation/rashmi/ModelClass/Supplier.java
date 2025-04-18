package com.example.moneyexchangesimulation.rashmi.ModelClass;
public class Supplier {
    private int accountNumber;
    private String name,cardDetails,transactionID,paymentDetails;

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
        return "Supplier{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", cardDetails='" + cardDetails + '\'' +
                ", transactionID='" + transactionID + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                '}';
    }

    public Supplier(int accountNumber, String name, String cardDetails, String transactionID, String paymentDetails) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.cardDetails = cardDetails;
        this.transactionID = transactionID;
        this.paymentDetails = paymentDetails;


    }
}
