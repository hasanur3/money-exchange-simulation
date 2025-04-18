package com.example.moneyexchangesimulation.rashmi.ModelClass;
public class Supplier {

    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Supplier{" +

                ", name='" + name + '\'' +

                '}';
    }

    public Supplier(int accountNumber, String name) {

        this.name = name;



    }
}
