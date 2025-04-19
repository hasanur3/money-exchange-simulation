package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class CurrencyExchange {
    private String customerId;
    private double amount;
    private String sourceCurrency;
    private String targetCurrency;
    private double exchangeRate;
    private double serviceFee;

    public CurrencyExchange(String customerId, double amount, String sourceCurrency, String targetCurrency, double exchangeRate, double serviceFee) {
        this.customerId = customerId;
        this.amount = amount;
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.exchangeRate = exchangeRate;
        this.serviceFee = serviceFee;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(String sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public void setTargetCurrency(String targetCurrency) {
        this.targetCurrency = targetCurrency;
    }

    @Override
    public String toString() {
        return "CurrencyExchange{" +
                "customerId='" + customerId + '\'' +
                ", amount=" + amount +
                ", sourceCurrency='" + sourceCurrency + '\'' +
                ", targetCurrency='" + targetCurrency + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", serviceFee=" + serviceFee +
                '}';
    }
}
