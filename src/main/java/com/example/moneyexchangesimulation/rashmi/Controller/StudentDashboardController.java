package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;

import javafx.event.ActionEvent;

import java.io.*;
import java.io.IOException;

public class StudentDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void availDiscount(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentGoal8");

    }

    @javafx.fxml.FXML
    public void transferMoney(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentGoal7");

    }

    @javafx.fxml.FXML
    public void earnRewards(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentGoal4");
    }

    @javafx.fxml.FXML
    public void currencyExchangeRates(ActionEvent actionEvent) throws IOException{

        SceneSwitcher.switchTo("StudentGoal1");
    }

    @javafx.fxml.FXML
    public void paymentMethod(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentGoal6");
    }

    @javafx.fxml.FXML
    public void eduFinancialTips(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentGoal3");
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void transaction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentGoal5");
    }

    @javafx.fxml.FXML
    public void convertCurrency(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("StudentGoal2");
    }
}