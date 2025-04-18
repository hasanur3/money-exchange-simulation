package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class TransactionMonitoring {
    private String transactionId;
    private double amount;
    private boolean highRisk;
    private String complianceNote;


    public TransactionMonitoring(String transactionId, double amount, boolean highRisk, String complianceNote) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.highRisk = highRisk;
        this.complianceNote = complianceNote;
    }

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

    public boolean isHighRisk() {
        return highRisk;
    }

    public void setHighRisk(boolean highRisk) {
        this.highRisk = highRisk;
    }

    public String getComplianceNote() {
        return complianceNote;
    }

    public void setComplianceNote(String complianceNote) {
        this.complianceNote = complianceNote;
    }

    @Override
    public String toString() {
        return "TransactionMonitoring{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", highRisk=" + highRisk +
                ", complianceNote='" + complianceNote + '\'' +
                '}';
    }
}
