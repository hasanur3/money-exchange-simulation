package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.CashReserve;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class c_ManageCashReservesController
{
    @javafx.fxml.FXML
    private ComboBox<String> operationTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> currencyTypeBox;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField amountField;

    private double stockLimit = 1000.0;
    private double currentStock = 800.0;

    @javafx.fxml.FXML
    public void initialize() {
        currencyTypeBox.getItems().addAll("USD", "EUR", "BDT"); // JPY removed
        operationTypeComboBox.getItems().addAll("Deposit", "Withdraw");
    }

    @javafx.fxml.FXML
    public void updateStockButton(ActionEvent actionEvent) {
        String currency = currencyTypeBox.getValue();
        String operation = operationTypeComboBox.getValue();
        String amountText = amountField.getText();

        if (currency == null || operation == null || amountText.isEmpty()) {
            statusLabel.setText("Fill all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            CashReserve reserve = new CashReserve(currency, amount, operation);

            if (operation.equals("Withdraw")) {
                if (amount > currentStock) {
                    statusLabel.setText("Insufficient stock! Request approval.");
                } else {
                    currentStock -= amount;
                    statusLabel.setText("Withdrawn " + amount + " " + currency + ". Stock: " + currentStock);
                }
            } else {
                currentStock += amount;
                statusLabel.setText("Deposited " + amount + " " + currency + ". Stock: " + currentStock);
            }

            // Check for threshold
            if (currentStock < 300.0) {
                statusLabel.setText(statusLabel.getText() + " | Stock below threshold! Alert manager.");
            }

        } catch (NumberFormatException e) {
            statusLabel.setText("Enter a valid number.");
        }
    }

    public double getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(double stockLimit) {
        this.stockLimit = stockLimit;
    }

    public double getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(double currentStock) {
        this.currentStock = currentStock;
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/q_BankTellerDashboard");
    }
}