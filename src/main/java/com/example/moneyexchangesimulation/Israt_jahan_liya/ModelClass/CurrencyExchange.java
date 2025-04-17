package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class CurrencyExchange {
    private String name;
    private int id;
    private String fromCurrency;
    private String toCurrency;
    private double amount;

    public CurrencyExchange(String name, int id, String fromCurrency, String toCurrency, double amount) {
        this.name = name;
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CurrencyExchange{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", fromCurrency=" + fromCurrency +
                ", toCurrency=" + toCurrency +
                ", amount=" + amount +
                '}';
    }
}
