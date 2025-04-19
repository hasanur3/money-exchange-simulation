package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class HighRiskTransaction {
    private String transactionId;
    private int riskScore;
    private String decision;
    private String systemAlert;

    public HighRiskTransaction(String transactionId, int riskScore, String decision, String systemAlert) {
        this.transactionId = transactionId;
        this.riskScore = riskScore;
        this.decision = decision;
        this.systemAlert = systemAlert;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public int getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(int riskScore) {
        this.riskScore = riskScore;
    }

    public String getSystemAlert() {
        return systemAlert;
    }

    public void setSystemAlert(String systemAlert) {
        this.systemAlert = systemAlert;
    }

    @Override
    public String toString() {
        return "HighRiskTransaction{" +
                "transactionId='" + transactionId + '\'' +
                ", riskScore=" + riskScore +
                ", decision='" + decision + '\'' +
                ", systemAlert='" + systemAlert + '\'' +
                '}';
    }
}
