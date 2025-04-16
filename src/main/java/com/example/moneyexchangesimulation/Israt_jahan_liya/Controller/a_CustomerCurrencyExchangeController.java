package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.CurrencyExchange;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class a_CustomerCurrencyExchangeController
{
    @javafx.fxml.FXML
    private TextField customerNameFieldTextField;
    @javafx.fxml.FXML
    private ComboBox<String> toCurrencyBoxComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> fromCurrencyBoxComboBox;
    @javafx.fxml.FXML
    private TextField idFieldTextField;
    @javafx.fxml.FXML
    private TextField amountFieldTextField;
    @javafx.fxml.FXML
    private Label errorMessageLabal;

    @javafx.fxml.FXML
    public void initialize() {
        fromCurrencyBoxComboBox.getItems().addAll("USD", "EUR", "BDT");
        toCurrencyBoxComboBox.getItems().addAll("USD", "EUR", "BDT");
    }

    @javafx.fxml.FXML
    public void confirmTransactionButtonOnAction(ActionEvent actionEvent) {
        errorMessageLabal.setText("Transaction confirmed. Receipt issued.");
    }

    private double getRate(String from, String to) {
        // Dummy rates
        if (from.equals("USD") && to.equals("BDT")) return 109.5;
        if (from.equals("EUR") && to.equals("BDT")) return 116.8;
        if (from.equals("BDT") && to.equals("USD")) return 0.0091;
        if (from.equals("BDT") && to.equals("EUR")) return 0.0085;
        return 1.0; // same currency or fallback
    }

    @javafx.fxml.FXML
    public void verifyButtonOnAction(ActionEvent actionEvent) {
        String id = idFieldTextField.getText();
        if (id != null && !id.isEmpty()) {
            errorMessageLabal.setText("ID verified: " + id);
        } else {
            errorMessageLabal.setText("Please enter a valid customer ID.");
        }
    }

    @javafx.fxml.FXML
    public void validateLimitButtonOnAction(ActionEvent actionEvent) {
        String amountText = amountFieldTextField.getText();
        try {
            double amount = Double.parseDouble(amountText);
            if (amount > 0 && amount <= 10000) {
                errorMessageLabal.setText("Amount is within the allowed limit.");
            } else {
                errorMessageLabal.setText("Amount is too high or invalid.");
            }
        } catch (NumberFormatException e) {
            errorMessageLabal.setText("Please enter a valid number for amount.");
        }
    }

    @javafx.fxml.FXML
    public void processExchangeButtonOnAction(ActionEvent actionEvent) {
        String name = customerNameFieldTextField.getText();
        String idText = idFieldTextField.getText();
        String from = fromCurrencyBoxComboBox.getValue();
        String to = toCurrencyBoxComboBox.getValue();
        String amountText = amountFieldTextField.getText();

        if (name.isEmpty() || idText.isEmpty() || from == null || to == null || amountText.isEmpty()) {
            errorMessageLabal.setText("Fill in all fields before processing.");
            return;
        }

        try {
            int id = Integer.parseInt(idText);
            double amount = Double.parseDouble(amountText);



            CurrencyExchange exchange = new CurrencyExchange(name, id, from, to, amount);


            errorMessageLabal.setText("Transaction processed for " + name + ". Amount: " + amount);

        } catch (NumberFormatException e) {
            errorMessageLabal.setText("Invalid ID or amount format.");
        }
    }


    @javafx.fxml.FXML
    public void getRatesButtonOnAction(ActionEvent actionEvent) {
        String from = fromCurrencyBoxComboBox.getValue();
        String to = toCurrencyBoxComboBox.getValue();

        if (from != null && to != null) {
            double rate = getRate(from, to);
            errorMessageLabal.setText("Exchange rate from " + from + " to " + to + " is: " + rate);
        } else {
            errorMessageLabal.setText("Select both source and target currencies.");
        }
    }
}