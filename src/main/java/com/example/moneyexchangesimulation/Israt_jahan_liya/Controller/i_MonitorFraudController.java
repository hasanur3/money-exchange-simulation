package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.TransactionMonitoring;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class i_MonitorFraudController
{
    @javafx.fxml.FXML
    private Label complianceStatusLabel;
    @javafx.fxml.FXML
    private Label riskLevelLabel;
    @javafx.fxml.FXML
    private TextField minAmountField;
    @javafx.fxml.FXML
    private TextField transactionIdField;
    private TransactionMonitoring currentLog;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logComplianceButton(ActionEvent actionEvent) {
        if (currentLog == null) {
            complianceStatusLabel.setText("No transaction to log.");
            return;
        }

        String note = currentLog.isHighRisk() ? "Escalated for Compliance Review" : "Approved - Compliant";
        currentLog.setComplianceNote(note);
        complianceStatusLabel.setText("Compliance Logged: " + note);
    }

    @javafx.fxml.FXML
    public void applyFilterButton(ActionEvent actionEvent) {
        String transactionId = transactionIdField.getText();
        String minAmountText = minAmountField.getText();

        if (transactionId.isEmpty() || minAmountText.isEmpty()) {
            riskLevelLabel.setText("Please enter all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(minAmountText);
            boolean isHighRisk = amount > 100000;

            currentLog = new TransactionMonitoring(
                    transactionId,
                    amount,
                    isHighRisk,
                    ""
            );

            riskLevelLabel.setText(isHighRisk ? "High-Risk Transaction Detected" : "Transaction Within Limits");
        } catch (NumberFormatException e) {
            riskLevelLabel.setText("Invalid amount format.");
        }
    }


    @javafx.fxml.FXML
    public void inspectButton(ActionEvent actionEvent) {
        if (currentLog == null) {
            riskLevelLabel.setText("No transaction loaded.");
            return;
        }

        boolean flagged = currentLog.getTransactionId().startsWith("SUSP");

        if (flagged) {
            currentLog.setHighRisk(true);
            riskLevelLabel.setText("Flagged: Suspicious Transaction Pattern Detected");
        } else {
            riskLevelLabel.setText("No Fraud Pattern Detected");
        }
    }
}