package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class a_CustomerCurrencyExchangeController {
    @javafx.fxml.FXML
    private TextField customerIDField;
    @javafx.fxml.FXML
    private ComboBox<String> sourceCurrencyBox;
    @javafx.fxml.FXML
    private Label exchangeRateLabel;
    @javafx.fxml.FXML
    private ComboBox<String> targetCurrencyBox;
    @javafx.fxml.FXML
    private Label transactionStatusLabel;
    @javafx.fxml.FXML
    private TextField amountField;

    @javafx.fxml.FXML
    public void initialize() {
        sourceCurrencyBox.getItems().addAll("USD", "EUR", "BDT");
        targetCurrencyBox.getItems().addAll("USD", "EUR", "BDT");

        // Set default selection for the combo boxes
        sourceCurrencyBox.setValue("USD");
        targetCurrencyBox.setValue("BDT");
    }

    @javafx.fxml.FXML
    public void onFetchExchangeRate(ActionEvent actionEvent) {
        String source = sourceCurrencyBox.getValue();
        String target = targetCurrencyBox.getValue();

        if (source == null || target == null || source.equals(target)) {
            exchangeRateLabel.setText("Please select different source and target currencies.");
            return;
        }

        // Dummy rate and fee for demonstration
        double rate = getDummyRate(source, target);
        double fee = 5.00;

        exchangeRateLabel.setText(String.format("Rate: %.2f | Fee: %.2f", rate, fee));
    }

    @javafx.fxml.FXML
    public void onProcessTransaction(ActionEvent actionEvent) {
        String customerId = customerIDField.getText();
        String amountText = amountField.getText();

        if (customerId.isEmpty() || amountText.isEmpty()) {
            transactionStatusLabel.setText("Please fill all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            if (amount <= 0) {
                transactionStatusLabel.setText("Amount must be greater than zero.");
                return;
            }

            // Simulate processing
            transactionStatusLabel.setText("Transaction completed. Receipt issued.");
        } catch (NumberFormatException e) {
            transactionStatusLabel.setText("Invalid amount.");
        }
    }

    private double getDummyRate(String source, String target) {
        // Dummy rates between currencies
        if (source.equals("USD") && target.equals("BDT")) return 110.5;
        if (source.equals("BDT") && target.equals("USD")) return 0.0091;
        if (source.equals("EUR") && target.equals("BDT")) return 117.3;
        if (source.equals("BDT") && target.equals("EUR")) return 0.0085;
        if (source.equals("USD") && target.equals("EUR")) return 0.93;
        if (source.equals("EUR") && target.equals("USD")) return 1.07;
        return 1.0;
    }

}