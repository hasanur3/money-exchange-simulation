package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CashierGoal5Controller
{
    @javafx.fxml.FXML
    private TextArea receiptDisplay;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private TextField transactionIdField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateReceipt(ActionEvent actionEvent) {
        String txnId = transactionIdField.getText();

        String receiptText = "===== Digital Receipt =====\n"
                + "Transaction ID: " + txnId + "\n"
                + "Customer: John Doe\n"
                + "Currency: USD\n"
                + "Amount: 500\n"
                + "Converted: 55000 BDT\n"
                + "Status: Completed\n"
                + "Date: 13-Apr-2025\n";

        receiptDisplay.setText(receiptText);
    }

    @javafx.fxml.FXML
    public void printReceipt(ActionEvent actionEvent) {
        confirmationLabel.setText("🖨️ Receipt printed successfully!");
    }

    @javafx.fxml.FXML
    public void sendEmail(ActionEvent actionEvent) {
        confirmationLabel.setText("📧 Receipt emailed successfully!");
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("cashier_dashboard");
    }
}