package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CashierGoal7Controller
{
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private Label approvalLabel;
    @javafx.fxml.FXML
    private Label finalStatusLabel;
    @javafx.fxml.FXML
    private TextField amountField;

    private boolean isApproved = false;
    private static final double LIMIT = 100000.0;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitRequest(ActionEvent actionEvent) {
        String input = amountField.getText();
        if (input.isEmpty()) {
            approvalLabel.setText("Please enter an amount.");
            return;
        }

        double amount = Double.parseDouble(input);

        if (amount > LIMIT) {
            approvalLabel.setText("Admin Approval Required...");
            isApproved = simulateAdminApproval(amount);
        } else {
            approvalLabel.setText("Transaction within limit. No approval needed.");
            isApproved = true;
        }
    }

    // Simulate admin approval function
    private boolean simulateAdminApproval(double amount) {
        return true; // here is always true
    }

    @javafx.fxml.FXML
    public void processExchange(ActionEvent actionEvent) {
        if (isApproved) {
            finalStatusLabel.setText("Transaction Approved. Proceeding...");
        } else {
            finalStatusLabel.setText("Transaction Denied or Not Approved Yet.");
        }
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_dashboard");
    }
}