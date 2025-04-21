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



    @javafx.fxml.FXML
    public void initialize() {

        currencyTypeComboBox.getItems().addAll("USD", "EUR", "JPY", "INR");
    }

    @javafx.fxml.FXML
    public void exchangeRates(ActionEvent actionEvent) {
        String selectedCurrency = currencyTypeComboBox.getValue();

        if (selectedCurrency == null) {
            showRatesLabel.setText("Please select a currency.");
            return;
        }


        if (selectedCurrency.equals("USD")) {
            showRatesLabel.setText("1 USD = 110.5 BDT");
        } else if (selectedCurrency.equals("EUR")) {
            showRatesLabel.setText("1 EUR = 120.0 BDT");
        } else if (selectedCurrency.equals("JPY")) {
            showRatesLabel.setText("1 JPY = 0.75 BDT");
        } else if (selectedCurrency.equals("INR")) {
            showRatesLabel.setText("1 INR = 1.3 BDT");
        } else {
            showRatesLabel.setText("Unknown currency.");
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