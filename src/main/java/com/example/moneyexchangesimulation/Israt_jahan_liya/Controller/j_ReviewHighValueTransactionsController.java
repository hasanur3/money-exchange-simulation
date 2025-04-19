package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.TransactionReview;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class j_ReviewHighValueTransactionsController
{
    @javafx.fxml.FXML
    private Label customerHistoryLabel;
    @javafx.fxml.FXML
    private Label reviewStatusLabel;
    @javafx.fxml.FXML
    private TextField transactionAmountField;
    @javafx.fxml.FXML
    private TextField transactionIdField;

    private TransactionReview currentReview;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyComplianceButton(ActionEvent actionEvent) {
        String id = transactionIdField.getText();
        String amountText = transactionAmountField.getText();

        if (id.isEmpty() || amountText.isEmpty()) {
            reviewStatusLabel.setText("Please fill all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            String history = (id.startsWith("AML")) ? "Past flagged activity found" : "No prior incidents";

            boolean isCompliant = !history.contains("flagged");

            currentReview = new TransactionReview(id, amount, history, isCompliant, "");
            customerHistoryLabel.setText(history);
            reviewStatusLabel.setText(isCompliant ? "Compliant with AML policies" : "Potential Risk Detected");

        } catch (NumberFormatException e) {
            reviewStatusLabel.setText("Invalid amount format.");
        }
    }

    @javafx.fxml.FXML
    public void submitReviewButton(ActionEvent actionEvent) {
        if (currentReview == null) {
            reviewStatusLabel.setText("No transaction to review.");
            return;
        }

        if (currentReview.isCompliant()) {
            currentReview.setReviewStatus("Approved");
            reviewStatusLabel.setText("Transaction Approved.");
        } else {
            currentReview.setReviewStatus("More Documents Requested / Denied");
            reviewStatusLabel.setText("Action Required: Collect More Info.");
        }
    }

}