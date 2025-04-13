package com.example.moneyexchangesimulation.rashmi.ModelClass;

import java.time.LocalDate;

public class PayRoll {
    private int employeeID;
    private String employeeName;
    private LocalDate DOJ;
    private double salary;

    public PayRoll() {
    }

    public PayRoll(int employeeID, String employeeName, LocalDate DOJ, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.DOJ = DOJ;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getDOJ() {
        return DOJ;
    }

    public void setDOJ(LocalDate DOJ) {
        this.DOJ = DOJ;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PayRoll{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", DOJ=" + DOJ +
                ", salary=" + salary +
                '}';
    }
}
