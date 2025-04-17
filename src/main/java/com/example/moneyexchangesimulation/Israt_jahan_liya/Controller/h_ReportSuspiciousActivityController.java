package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.SuspiciousActivityReport;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class h_ReportSuspiciousActivityController
{
    @javafx.fxml.FXML
    private Label accountStatusLabel;
    @javafx.fxml.FXML
    private Label systemFlagLabel;
    @javafx.fxml.FXML
    private TextField amountField;
    @javafx.fxml.FXML
    private TextField customerNameField;
    @javafx.fxml.FXML
    private TextField transactionDetailsField;

    private boolean isFlagged = false;

    @javafx.fxml.FXML
    public void initialize() {
        systemFlagLabel.setText("");
        accountStatusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void verifyLockButton(ActionEvent actionEvent) {
        String customerName = customerNameField.getText();
        String transactionDetails = transactionDetailsField.getText();

        if (customerName.isEmpty() || transactionDetails.isEmpty()) {
            systemFlagLabel.setText("Please fill in all fields.");
            return;
        }

        // Simulate auto-flag based on keyword
        isFlagged = transactionDetails.toLowerCase().contains("suspicious");

        SuspiciousActivityReport sar = new SuspiciousActivityReport(
                customerName,
                transactionDetails,
                isFlagged,
                false
        );

        systemFlagLabel.setText(isFlagged ? "System Flag: High-Risk Activity Detected" : "System Flag: Normal Activity");
    }

    @javafx.fxml.FXML
    public void submitReportButton(ActionEvent actionEvent) {
        if (isFlagged) {
            accountStatusLabel.setText("Account Locked. Report Escalated to Manager.");
        } else {
            accountStatusLabel.setText("No further action required.");
        }
    }
}