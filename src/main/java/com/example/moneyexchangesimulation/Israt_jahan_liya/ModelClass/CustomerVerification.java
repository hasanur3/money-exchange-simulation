package com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass;

public class CustomerVerification {
    private String name;
    private int id;
    private int transactionId;

    public CustomerVerification(String name, int id, int transactionId) {
        this.name = name;
        this.id = id;
        this.transactionId = transactionId;
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

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "CustomerVerification{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", transactionId=" + transactionId +
                '}';
    }
}
