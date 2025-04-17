package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class RefundInfo {
    private String referenceId;
    private double refundAmount;

    public RefundInfo(String referenceId, double refundAmount) {
        this.referenceId = referenceId;
        this.refundAmount = refundAmount;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
    }

    @Override
    public String toString() {
        return "RefundInfo{" +
                "referenceId='" + referenceId + '\'' +
                ", refundAmount=" + refundAmount +
                '}';
    }
}
