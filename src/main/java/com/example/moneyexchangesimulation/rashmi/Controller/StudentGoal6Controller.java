package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StudentGoal6Controller
{
    @javafx.fxml.FXML
    private Tab paymentDetailsTab;
    @javafx.fxml.FXML
    private TextField accNumberTextField;
    @javafx.fxml.FXML
    private Tab paymentMethodTab;
    @javafx.fxml.FXML
    private TabPane paymentTabpane;
    @javafx.fxml.FXML
    private TextField cardDetailsTextField;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentDashboard");
    }

    @javafx.fxml.FXML
    public void savePayment(ActionEvent actionEvent) {
        Tab selectedTab = paymentTabpane.getSelectionModel().getSelectedItem();

        if (selectedTab.equals(paymentDetailsTab)) {
            String accountNumber = accNumberTextField.getText().trim();
            if (accountNumber.isEmpty() || accountNumber.length() < 8) {
                messageLabel.setText("Please enter a valid account number.");
                return;
            }
            messageLabel.setText("Account details saved successfully.");
        } else if (selectedTab.equals(paymentMethodTab)) {
            String cardDetails = cardDetailsTextField.getText().trim();
            if (cardDetails.isEmpty() || cardDetails.length() < 12) {
                messageLabel.setText("Please enter valid card details.");
                return;
            }
            messageLabel.setText("Card details saved successfully.");
        } else {
            messageLabel.setText("Please select a valid payment method tab.");
        }
    }

}