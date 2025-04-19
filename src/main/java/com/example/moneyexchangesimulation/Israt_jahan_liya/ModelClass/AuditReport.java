package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class AuditReport {
    private String startDate;
    private String endDate;
    private boolean flagged;
    private String auditStatus;

    public AuditReport(String startDate, String endDate, boolean flagged, String auditStatus) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.flagged = flagged;
        this.auditStatus = auditStatus;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Override
    public String toString() {
        return "AuditReport{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", flagged=" + flagged +
                ", auditStatus='" + auditStatus + '\'' +
                '}';
    }
}
