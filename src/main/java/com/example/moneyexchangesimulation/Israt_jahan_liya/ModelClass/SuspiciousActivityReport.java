package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class SuspiciousActivityReport {
    private String customerName;
    private String transactionDetails;
    private boolean flagged;
    private boolean accountLocked;

    public SuspiciousActivityReport(String customerName, String transactionDetails, boolean flagged, boolean accountLocked) {
        this.customerName = customerName;
        this.transactionDetails = transactionDetails;
        this.flagged = flagged;
        this.accountLocked = accountLocked;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public boolean isAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    @Override
    public String toString() {
        return "SuspiciousActivityReport{" +
                "customerName='" + customerName + '\'' +
                ", transactionDetails='" + transactionDetails + '\'' +
                ", flagged=" + flagged +
                ", accountLocked=" + accountLocked +
                '}';
    }
}
