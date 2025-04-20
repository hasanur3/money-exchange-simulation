package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StudentGoal2Controller
{
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private Label showAmountLabel;
    @javafx.fxml.FXML
    private ComboBox<String> currencyComboBox;
    private final ObservableList<String> currencyList = FXCollections.observableArrayList("USD", "EUR", "JPY", "INR");

    @javafx.fxml.FXML
    public void initialize() {
        currencyComboBox.setItems(currencyList);
    }
    private double convertAmount(double amount, String currency) {
        switch (currency) {
            case "INR":
                return amount * 83.10;
            case "EUR":
                return amount * 0.92;
            case "GBP":
                return amount * 0.79;
            case "JPY":
                return amount * 151.23;
            case "AUD":
                return amount * 1.52;
            default:
                return amount; // If currency not matched, return the same amount
        }
    }

    @javafx.fxml.FXML
    public void currencyConverter(ActionEvent actionEvent) {
        String selectedCurrency = currencyComboBox.getValue();
        String amountText = amountTextField.getText();

        if (selectedCurrency == null || amountText.isEmpty()) {
            showAmountLabel.setText("Please select currency and enter amount.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            double convertedAmount = convertAmount(amount, selectedCurrency);
            showAmountLabel.setText(String.format("%.2f USD = %.2f %s", amount, convertedAmount, selectedCurrency));
        } catch (NumberFormatException e) {
            showAmountLabel.setText("Please enter a valid number.");
        }
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void saveConversion(ActionEvent actionEvent) {
        String selectedCurrency = currencyComboBox.getValue();
        String amountText = amountTextField.getText();

        if (selectedCurrency != null && !amountText.isEmpty()) {
            showAmountLabel.setText("Conversion saved: " + amountText + " USD to " + selectedCurrency);
            System.out.println("Saved conversion: " + amountText + " USD to " + selectedCurrency);
        } else {
            showAmountLabel.setText("Nothing to save.");
        }
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentDashboard");
    }
}