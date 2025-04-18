package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BusinessOwnerGoal4Controller
{
    @javafx.fxml.FXML
    private Label validationLabel;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private TextField bankAccountNumberTextField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        validationLabel.setText(" ");
        confirmationLabel.setText("");
        statusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void bulkTransaction(ActionEvent actionEvent) {
        String account = bankAccountNumberTextField.getText().trim();

        // Validate input (VR)
        if (account.isEmpty() || !account.matches("\\d{10,18}")) {
            validationLabel.setText("Invalid account number.");
            return;
        }

        validationLabel.setText("Account validated.");

        // Simulate processing (DP, OP)
        statusLabel.setText("Bulk transactions processed successfully.");

        // Simulate receipt confirmation (UIE, DP, OP)
        confirmationLabel.setText("Receipts downloaded successfully.");
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerDashboard");
    }
}