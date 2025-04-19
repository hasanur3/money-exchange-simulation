package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class InvestigationReport {
    private String customerId;
    private String behaviorSummary;
    private String investigationOutcome;

    public InvestigationReport(String customerId, String behaviorSummary, String investigationOutcome) {
        this.customerId = customerId;
        this.behaviorSummary = behaviorSummary;
        this.investigationOutcome = investigationOutcome;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBehaviorSummary() {
        return behaviorSummary;
    }

    public void setBehaviorSummary(String behaviorSummary) {
        this.behaviorSummary = behaviorSummary;
    }

    public String getInvestigationOutcome() {
        return investigationOutcome;
    }

    public void setInvestigationOutcome(String investigationOutcome) {
        this.investigationOutcome = investigationOutcome;
    }

    @Override
    public String toString() {
        return "InvestigationReport{" +
                "customerId='" + customerId + '\'' +
                ", behaviorSummary='" + behaviorSummary + '\'' +
                ", investigationOutcome='" + investigationOutcome + '\'' +
                '}';
    }
}
