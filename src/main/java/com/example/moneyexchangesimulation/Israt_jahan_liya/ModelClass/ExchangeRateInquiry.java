package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class ExchangeRateInquiry {
    private String currencyType;
    private double amount;

    public ExchangeRateInquiry(String currencyType, double amount) {
        this.currencyType = currencyType;
        this.amount = amount;
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
        return "ExchangeRateInquiry{" +
                "currencyType='" + currencyType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
