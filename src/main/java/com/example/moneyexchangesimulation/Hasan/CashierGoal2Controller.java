package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CashierGoal2Controller
{
    @javafx.fxml.FXML
    private Label actionRequiredLabel;
    @javafx.fxml.FXML
    private TextField customerIdField;
    @javafx.fxml.FXML
    private Label verificationStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkVerification(ActionEvent actionEvent) {
        String customerId = customerIdField.getText();
        if(customerId.isEmpty()){
            verificationStatusLabel.setText("Status: Please Enter an Id");
            actionRequiredLabel.setText("");
            return;
        }
        boolean isVerified=customerId.startsWith("v");
        if (isVerified) {
            verificationStatusLabel.setText("Status: Verified ✅");
            actionRequiredLabel.setText("Customer is eligible for transactions.");
        } else {
            verificationStatusLabel.setText("Status: Unverified ❌");
            actionRequiredLabel.setText("Please request additional documents or deny the transaction.");
        }
    }
    @javafx.fxml.FXML
       public void goToDashboard(ActionEvent actionEvent) throws IOException {
       SceneSwitcher.switchTo("cashier_dashboard");
    }
}