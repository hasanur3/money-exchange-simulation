package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SystemManagerGoal6Controller
{
    @javafx.fxml.FXML
    private Label otpLabel;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField otpField;


    private String generatedOtp;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void enable2FA(ActionEvent actionEvent) {
        generatedOtp = "123456";
        otpLabel.setText("📨 OTP sent to registered email/phone: " + generatedOtp);
        statusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void validateOTP(ActionEvent actionEvent) {
        String enteredOtp =otpField.getText();
        if (enteredOtp.equals(generatedOtp)) {
            statusLabel.setText("✅ 2FA enabled successfully.");
        } else {
            statusLabel.setText("❌ Incorrect OTP. Please try again.");
        }
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("systemManagerDashboard");
    }
}