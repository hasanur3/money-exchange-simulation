package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BusinessOwnerGoal8Controller
{
    @javafx.fxml.FXML
    private TextField supplierNameTextField;
    @javafx.fxml.FXML
    private TextField accNumberTextField;
    @javafx.fxml.FXML
    private TextField transID;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private Label validateLabel;

    @javafx.fxml.FXML
    public void initialize() {
        validateLabel.setText("");
        confirmationLabel.setText("");
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void sendSMS(ActionEvent actionEvent) {
        String supplierName = supplierNameTextField.getText().trim();

        if (supplierName.isEmpty()) {
            confirmationLabel.setText("Enter supplier name to send SMS.");
        } else {
            confirmationLabel.setText("SMS sent to " + supplierName + " confirming payment.");
        }

    }

    @javafx.fxml.FXML
    public void supplierPayment(ActionEvent actionEvent) {
        String supplierName = supplierNameTextField.getText().trim();
        String accountNumber = accNumberTextField.getText().trim();
        String transactionId = transID.getText().trim();


        if (supplierName.isEmpty() || accountNumber.isEmpty() || transactionId.isEmpty()) {
            validateLabel.setText("All fields are required.");
            return;
        }

        if (!accountNumber.matches("\\d{10,18}")) {
            validateLabel.setText("Invalid account number.");
            return;
        }


        validateLabel.setText("Payment validated and processed.");
        confirmationLabel.setText("Payment to " + supplierName + " confirmed. Transaction ID: " + transactionId);
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerDashboard");
    }
}