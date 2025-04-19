package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class ReviewAlert {
    private String alertId;
    private String alertDetails;
    private String actionTaken;

    public ReviewAlert(String alertId, String alertDetails, String actionTaken) {
        this.alertId = alertId;
        this.alertDetails = alertDetails;
        this.actionTaken = actionTaken;
    }

    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public String getAlertDetails() {
        return alertDetails;
    }

    public void setAlertDetails(String alertDetails) {
        this.alertDetails = alertDetails;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    @Override
    public String toString() {
        return "ReviewAlert{" +
                "alertId='" + alertId + '\'' +
                ", alertDetails='" + alertDetails + '\'' +
                ", actionTaken='" + actionTaken + '\'' +
                '}';
    }
}
