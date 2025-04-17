package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class FinancialReport {
    private String startDate;
    private String endDate;
    private String reportType;

    public FinancialReport(String startDate, String endDate, String reportType) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.reportType = reportType;
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

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "FinancialReport{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", reportType='" + reportType + '\'' +
                '}';
    }
}
