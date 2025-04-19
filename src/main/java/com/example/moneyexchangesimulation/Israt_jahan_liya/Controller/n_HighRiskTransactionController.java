package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.HighRiskTransaction;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class n_HighRiskTransactionController
{
    @javafx.fxml.FXML
    private Label decisionStatusLabel;
    @javafx.fxml.FXML
    private Label alertLabel;
    @javafx.fxml.FXML
    private TextField transactionIdField;
    @javafx.fxml.FXML
    private Label riskScoreLabel;

    private HighRiskTransaction transaction;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void reviewTransactionButton(ActionEvent actionEvent) {
        String txId = transactionIdField.getText();

        if (txId.isEmpty()) {
            decisionStatusLabel.setText("Please enter Transaction ID.");
            return;
        }

        // Simulate risk score generation
        int riskScore = new Random().nextInt(101); // 0-100 scale
        String alert = (riskScore > 70) ? "High Risk Alert!" : "No Alert";
        String decision;

        if (riskScore > 85) {
            decision = "Blocked";
        } else if (riskScore > 60) {
            decision = "Needs Further Review";
        } else {
            decision = "Approved";
        }

        transaction = new HighRiskTransaction(txId, riskScore, decision, alert);

        // Update UI
        riskScoreLabel.setText(String.valueOf(riskScore));
        alertLabel.setText(alert);
        decisionStatusLabel.setText(decision);
    }
}