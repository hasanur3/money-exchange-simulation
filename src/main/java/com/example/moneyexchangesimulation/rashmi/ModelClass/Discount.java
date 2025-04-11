package com.example.moneyexchangesimulation.rashmi.ModelClass;

public class Discount {
    private int id;
    private String name;
    private float discountRate;

    public Discount() {
    }

    public Discount(int id, String name, float discountRate) {
        this.id = id;
        this.name = name;
        this.discountRate = discountRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(float discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discountRate=" + discountRate +
                '}';
    }
}
