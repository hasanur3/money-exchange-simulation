package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class d_HandleLargeTransactionsController
{
    @javafx.fxml.FXML
    private Label flagStatusLabel;
    @javafx.fxml.FXML
    private Label finalStatusLabel;
    @javafx.fxml.FXML
    private Label approvalStatusLabel;
    @javafx.fxml.FXML
    private TextField amountField;

    @javafx.fxml.FXML
    public void initialize() {
        flagStatusLabel.setText("");
        approvalStatusLabel.setText("");
        finalStatusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void processButton(ActionEvent actionEvent) {
        String amountText = amountField.getText();

        if (amountText.isEmpty()) {
            flagStatusLabel.setText("Please enter amount.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            boolean isLarge = amount > 10000;

            if (isLarge) {
                flagStatusLabel.setText("Flagged: Large Transaction");


                boolean approved = true;
                approvalStatusLabel.setText("Approval Granted by Supervisor");


                finalStatusLabel.setText("Large Transaction of " + amount + " executed successfully.");
            } else {
                flagStatusLabel.setText("Normal Transaction");
                approvalStatusLabel.setText("No approval needed");
                finalStatusLabel.setText("Transaction of " + amount + " processed successfully.");
            }

        } catch (NumberFormatException e) {
            flagStatusLabel.setText("Invalid amount format.");
        }
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/q_BankTellerDashboard");
    }
}