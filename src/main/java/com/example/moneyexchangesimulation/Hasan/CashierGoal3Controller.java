package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CashierGoal3Controller
{
    @javafx.fxml.FXML
    private Label validationLabel;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private TextField transactionIdField;
    @javafx.fxml.FXML
    private Label transactionDetailsLabel;

    private String currentTxnId;
    private boolean transactionFound;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void findTransactionButton(ActionEvent actionEvent) {
        String txnId = transactionIdField.getText().trim();

        if (txnId.isEmpty()){
            transactionDetailsLabel.setText("Transaction Details: Please enter a valid ID.");
            transactionFound = false;
            return;
        }

        if(txnId.startsWith("TXN")){
            transactionFound=true;
            currentTxnId = txnId;
            transactionDetailsLabel.setText("Transaction Details: [Sample] ID = " + txnId + ", Amount = 500 BDT");
            validationLabel.setText("");
            confirmationLabel.setText("");
        }
        else {
            transactionFound = false;
            transactionDetailsLabel.setText("Transaction is not found!");
        }
    }

    @javafx.fxml.FXML
    public void refundButton(ActionEvent actionEvent) {
        if(!transactionFound){
            validationLabel.setText("Transaction not found or invalid.");
            confirmationLabel.setText("");
            return;
        }
        boolean eligible = currentTxnId.endsWith("5");

        if (eligible) {
            confirmationLabel.setText("Refund processed successfully for " + currentTxnId);
            validationLabel.setText("");
        } else {
            validationLabel.setText("Refund not eligible. Time window expired.");
            confirmationLabel.setText("");
        }
    }

    @javafx.fxml.FXML
    public void correctButton(ActionEvent actionEvent) {
        if (!transactionFound) {
            validationLabel.setText("Transaction not found or invalid.");
            confirmationLabel.setText("");
            return;
        }

        confirmationLabel.setText("Correction option selected. Please proceed to edit details manually.");
        validationLabel.setText("");
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_dashboard");
    }
}