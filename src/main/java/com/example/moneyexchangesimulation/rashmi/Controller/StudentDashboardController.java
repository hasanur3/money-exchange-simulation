package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;

public class StudentDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void availDiscount(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void transferMoney(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void earnRewards(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void currencyExchangeRates(ActionEvent actionEvent) {
        SceneSwitcher.switchTo("StudentGoal1");
    }

    @javafx.fxml.FXML
    public void paymentMethod(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void eduFinancialTips(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void transaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void convertCurrency(ActionEvent actionEvent) {
        SceneSwitcher.switchTo("StudentGoal2");
    }
}