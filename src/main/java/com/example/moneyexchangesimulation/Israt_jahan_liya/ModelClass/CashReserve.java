package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class CashReserve {
    private String currencyType;
    private double amount;
    private String operationType;

    public CashReserve(String currencyType, double amount, String operationType) {
        this.currencyType = currencyType;
        this.amount = amount;
        this.operationType = operationType;
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

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }


    @Override
    public String toString() {
        return "CashReserve{" +
                "currencyType='" + currencyType + '\'' +
                ", amount=" + amount +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}
