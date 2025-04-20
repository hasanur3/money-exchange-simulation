package com.example.moneyexchangesimulation.Hasan;

import com.example.moneyexchangesimulation.Hasan.ModelClass.CustomerTransaction;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CashierGoal1Controller
{
    @javafx.fxml.FXML
    private TextField customerNameField;
    @javafx.fxml.FXML
    private TextField customerIdField;
    @javafx.fxml.FXML
    private TextField amountField;
    @javafx.fxml.FXML
    private ComboBox<String> currencyTypeCombo;
    @javafx.fxml.FXML
    private Label convertedAmountLabel;
    @javafx.fxml.FXML
    private Label transactionStatusLabel;
    @javafx.fxml.FXML
    private Label receiptStatusLabel;
    @javafx.fxml.FXML
    private Label validationLabel;
    @javafx.fxml.FXML
    private Label confirmationLabel;

    private CustomerTransaction currentTransaction;

    @javafx.fxml.FXML
    public void initialize() {
        currencyTypeCombo.getItems().addAll("USD", "EUR", "GBP");
    }

    @javafx.fxml.FXML
    public void handleNewTransaction(ActionEvent actionEvent) {
        customerNameField.clear();
        customerIdField.clear();
        amountField.clear();
        currencyTypeCombo.getSelectionModel().clearSelection();

        convertedAmountLabel.setText("Converted Amount: ");
        validationLabel.setText("Cash Availability: ");
        confirmationLabel.setText("");
        receiptStatusLabel.setText("");

        currentTransaction = null;
    }

    @javafx.fxml.FXML
    public void calculateExchange(ActionEvent actionEvent) {
        try {
            String name = customerNameField.getText();
            String id = customerIdField.getText();
            String currency = currencyTypeCombo.getValue();
            double amount = Double.parseDouble(amountField.getText());

            currentTransaction = new CustomerTransaction(name, id, currency, amount);

            double rate = switch (currency) {
                case "USD" -> 110.0;
                case "EUR" -> 118.0;
                case "GBP" -> 128.0;
                default -> 100.0;
            };

            double convertedAmount = currentTransaction.calculateExchange(rate);
            convertedAmountLabel.setText("Converted Amount: " + convertedAmount + " BDT");
        } catch (Exception e) {
            convertedAmountLabel.setText("Invalid Input");
        }
    }

    @javafx.fxml.FXML
    public void validateFunds(ActionEvent actionEvent) {
        if (currentTransaction == null) {
            validationLabel.setText("Start a transaction first");
            return;
        }
        boolean valid = currentTransaction.validateFunds(100000);
        validationLabel.setText(valid ? "Cash Available" : "Insufficient Funds");
    }

    @javafx.fxml.FXML
    public void confirmTransaction(ActionEvent actionEvent) {
        if (currentTransaction != null) {
            transactionStatusLabel.setText("Transaction Completed");
        } else {
            transactionStatusLabel.setText("No transaction to confirm");
        }
    }

    @javafx.fxml.FXML
    public void sendReceipt(ActionEvent actionEvent) {
        if (currentTransaction != null) {
            receiptStatusLabel.setText("Receipt Sent");
        } else {
            receiptStatusLabel.setText("No transaction to send receipt");
        }
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_dashboard");
    }
}
