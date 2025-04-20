package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class StudentGoal1Controller
{
    @javafx.fxml.FXML
    private Label showRatesLabel;
    @javafx.fxml.FXML
    private ComboBox<String> currencyTypeComboBox;

    private final ObservableList<String> currencyList = FXCollections.observableArrayList("USD", "EUR", "JPY", "INR");

    @javafx.fxml.FXML
    public void initialize() {
        currencyTypeComboBox.setItems(currencyList);
    }

    @javafx.fxml.FXML
    public void exchangeRates(ActionEvent actionEvent) {
        String selectedCurrency = currencyTypeComboBox.getValue();

        if (selectedCurrency != null) {
            int rate = Integer.parseInt(selectedCurrency);
            showRatesLabel.setText("1 USD = " + rate +" " + selectedCurrency);
        } else {
            showRatesLabel.setText("Please select a currency.");
        }
    }

    @javafx.fxml.FXML
    public void saveCurrency(ActionEvent actionEvent) {
        String selectedCurrency = currencyTypeComboBox.getValue();

        if (selectedCurrency != null) {
            // Simulate saving the selected currency
            System.out.println("Currency saved: " + selectedCurrency);
            showRatesLabel.setText("Saved currency: " + selectedCurrency);
        } else {
            showRatesLabel.setText("No currency selected to save.");
        }
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Login");

    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentDashboard");
    }
}