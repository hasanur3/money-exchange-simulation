package com.example.moneyexchangesimulation.Hasan.ModelClass;

public class CustomerTransaction {
    private String customerName;
    private String customerId;
    private String currencyType;
    private double amount;
    private double convertedAmount;

    public CustomerTransaction(String customerName, String customerId, String currencyType, double amount) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.currencyType = currencyType;
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public double getAmount() {
        return amount;
    }

    public void setConvertedAmount(double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public double calculateExchange(double rate) {
        convertedAmount = amount * rate;
        return convertedAmount;
    }

    public boolean validateFunds(double availableFunds) {
        return (amount * rateFromCurrency()) <= availableFunds;
    }

    private double rateFromCurrency() {
        return switch (currencyType) {
            case "USD" -> 110.0;
            case "EUR" -> 118.0;
            case "GBP" -> 128.0;
            default -> 100.0;
        };
    }
}
